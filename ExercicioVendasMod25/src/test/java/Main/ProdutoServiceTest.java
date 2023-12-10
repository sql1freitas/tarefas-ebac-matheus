/**
 * 
 */
package Main;

import java.math.BigDecimal;

import Main.dao.ProdutoDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Main.dao.IProdutoDAO;
import Main.domain.Produto;
import Main.exceptions.TipoChaveNaoEncontradaException;
import Main.services.IProdutoService;
import Main.services.ProdutoService;


public class ProdutoServiceTest {

	private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
	}
	
	@Test
	public void pesquisar() {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Matheus Felipe");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Matheus Felipe", produto.getNome());
	}
}
