/**
 * 
 */
package Main;

import java.math.BigDecimal;

import Main.dao.IProdutoDAO;
import Main.services.IProdutoService;
import Main.services.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Main.dao.ProdutoDaoMock;
import Main.domain.Produto;
import Main.exceptions.DAOException;
import Main.exceptions.TipoChaveNaoEncontradaException;


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
		produto.setFornecedor("EBAC LTDA");
	}
	
	@Test
	public void pesquisar() throws DAOException {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() throws DAOException {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		produto.setNome("Matheus Freitas");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Matheus Freitas", produto.getNome());
	}
}
