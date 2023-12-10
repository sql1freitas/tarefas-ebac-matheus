/**
 * 
 */
package Main;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Main.dao.ClienteDAO;
import Main.dao.IClienteDAO;
import Main.domain.Cliente;
import Main.exceptions.TipoChaveNaoEncontradaException;


public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;

	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDAO();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Matheus");
		cliente.setCidade("Rio de Janeiro");
		cliente.setEnd("End");
		cliente.setEstado("RJ");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setCpf(56565656565L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Matheus Felipe");
		clienteDao.alterar(cliente);
		Assert.assertEquals("Matheus Felipe", cliente.getNome());
	}
	
	@Test
	public void buscarTodos() {
		Collection<Cliente> list = clienteDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
	}
}
