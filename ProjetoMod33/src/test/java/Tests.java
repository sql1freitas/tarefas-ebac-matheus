import Domain.Acessorio;
import Domain.Carro;
import Domain.Marca;
import Service.GenericService;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void cadastrarTest(){
        GenericService service = new GenericService();

        Marca marca = new Marca();
        marca.setNome("BMW");

        Carro carro = new Carro();
        carro.setMarca(marca);
        carro.setModelo("BMW GTR M3");

        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Farol de Led");
        acessorio.setValor(3450.00);
        acessorio.setCarro(carro);


        service.cadastrar(marca);
        service.cadastrar(carro);
        service.cadastrar(acessorio);

        Assert.assertNotNull(marca);
        Assert.assertNotNull(carro);
        Assert.assertNotNull(acessorio);





    }
}
