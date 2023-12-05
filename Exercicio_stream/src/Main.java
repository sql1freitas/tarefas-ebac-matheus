import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Matheus
 */


public class Main {




    public static void main(String[] args){


        /*
        Criação da lista de pessoas para demonstração do exercício
         */

        List<Pessoa> pessoaList = new ArrayList<>(List.of(

                new Pessoa("Matheus", "Masculino", 24, 2000.00),
                new Pessoa("Ana Carolina", "Feminino", 21, 1500.00),
                new Pessoa("Pedro", "Masculino", 26, 20000.00),
                new Pessoa("Emanuel", "Masculino", 25, 3000.00),
                new Pessoa("Helena", "Feminio", 18, 1350.25),
                new Pessoa("Ivoneide", "Feminino", 61, 1500.00),
                new Pessoa("Elaine", "Feminino", 38, 3500.00)



        ));

        /*
        Aplicação de diversos filtros usando o recurso stream() e funções lambda.
         */


        List <Pessoa> filtroFeminino = pessoaList.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .filter(pessoa -> pessoa.getSexo() == "Feminino")
                .collect(Collectors.toList());

        System.out.println("Filtro feminino");
        System.out.println(filtroFeminino);
        System.out.println(" ");


        List <Pessoa> filtroMasculino = pessoaList.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .filter(pessoa -> pessoa.getSexo() == "Masculino")
                .collect(Collectors.toList());

        System.out.println("Filtro masculino");
        System.out.println(filtroMasculino);
        System.out.println(" ");

        List <Pessoa> filtroMaiorIdade = pessoaList.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .max(Comparator.comparing(Pessoa::getIdade))
                .stream().collect(Collectors.toList());

        System.out.println("Filtro para maior idade");
        System.out.println(filtroMaiorIdade);
        System.out.println(" ");


        List <Pessoa> filtroMaiorIdadeMasculino = pessoaList.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .filter(pessoa -> pessoa.getSexo() == "Masculino")
                .max(Comparator.comparing(Pessoa::getIdade))
                .stream().collect(Collectors.toList());

        System.out.println("Filtro maior idade do sexo masculino");
        System.out.println(filtroMaiorIdadeMasculino);
        System.out.println(" ");

        List <Pessoa> filtroMaiorRenda = pessoaList.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .max(Comparator.comparing(Pessoa::getRenda))
                .stream().collect(Collectors.toList());

        System.out.println("Filtro de maior renda");
        System.out.println(filtroMaiorRenda);
        System.out.println(" ");

        List <Pessoa> filtroTop3MaiorRenda = pessoaList.stream()
                .sorted(Comparator.comparing(Pessoa::getRenda).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Filtro Top 3 maior renda");
        System.out.println(filtroTop3MaiorRenda);
        System.out.println(" ");
    }
}

