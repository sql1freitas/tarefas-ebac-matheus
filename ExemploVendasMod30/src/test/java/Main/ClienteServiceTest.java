/**
 * 
 */
package Main;

import Main.dao.ClienteDaoMock;
import Main.dao.IClienteDAO;
import Main.services.ClienteService;
import Main.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Main.domain.Cliente;
import Main.exceptions.DAOException;
import Main.exceptions.TipoChaveNaoEncontradaException;


public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Matheus");
		cliente.setCidade("Rio de Janeiro");
		cliente.setEnd("End");
		cliente.setEstado("RJ");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		cliente.setEmail("teste@ebac.com");
		
	}
	
	@Test
	public void pesquisarCliente() throws DAOException {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() throws DAOException {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		cliente.setNome("Matheus Freitas");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Matheus Freitas", cliente.getNome());
	}
}
