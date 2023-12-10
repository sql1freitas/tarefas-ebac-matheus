/**
 * 
 */
package Main;

import Main.dao.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Main.dao.IClienteDAO;
import Main.domain.Cliente;
import Main.exceptions.TipoChaveNaoEncontradaException;
import Main.services.ClienteService;
import Main.services.IClienteService;


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
		cliente.setCidade("Rio de janeiro");
		cliente.setEnd("End");
		cliente.setEstado("RJ");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Matheus Felipe");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Matheus Felipe", cliente.getNome());
	}
}
