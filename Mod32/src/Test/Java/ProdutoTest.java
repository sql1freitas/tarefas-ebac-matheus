package Test.Java;

import Main.Java.Domain.Produto;
import Main.Java.Service.IProdutoService;
import Main.Java.Service.ProdutoService;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {

    @Test
    public void TesteCadastrarProduto(){

        IProdutoService testeProduto = new ProdutoService();

        Produto produto1 = new Produto();
        produto1.setNome("Placa de vídeo");
        produto1.setValor(3500.00);

        testeProduto.cadastrarProduto(produto1);

        Assert.assertNotNull(produto1);
        Assert.assertNotNull(produto1.getId());


    }



}
