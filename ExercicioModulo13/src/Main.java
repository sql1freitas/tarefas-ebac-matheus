import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Matheus
 * Programa para cadastro de pessoas e divisão das mesmas em Arrays
 */

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        List <Pessoa> listaPessoaFisica = new ArrayList<>();
        List <Pessoa> listaPessoaJuridica = new ArrayList<>();

/**
 * Lógica do menu para cadastramento de várias pessoas até o usuário sair do programa.
 */

        for(int i = 1; i >0; i++) {


        System.out.println(" **** Cadastro de Pessoas ****");
        System.out.println("Digite o número de sua respectiva opção!");
        System.out.println("******************************");

        System.out.println("(1) Cadastrar Pessoa Fìsica");
        System.out.println("(2) Cadastrar Pessoa Jurídica");
        System.out.println("(3) Sair");
        Integer opcao = input.nextInt();

            if (opcao == 1){

               System.out.println("Digite o nome da pessoa: ");
               String nome = input.next();
               System.out.println("Digite a idade da pessoa: ");
               Integer idade = input.nextInt();
               System.out.println("Digite o CPF da pessoa: ");
               String cpf = input.next();

               listaPessoaFisica.add(new PessoaFisica(nome, idade, cpf));
           }
            else if (opcao == 2) {
                System.out.println("Digite o nome da pessoa jurídica: ");
                String nome = input.next();
                System.out.println("Digite a idade da pessoa jurídica: ");
                Integer idade = input.nextInt();
                System.out.println("Digite o CNPJ da pessoa jurídica: ");
                String cnpj = input.next();

                listaPessoaJuridica.add(new PessoaJuridica(nome,idade,cnpj));
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        /**
         * Demonstração do resultado para o usuário
         */

        System.out.println("Pessoas físicas cadastradas: " + listaPessoaFisica);
        System.out.println("********************************");
        System.out.println("Pessoas juríficas cadastradas: " + listaPessoaJuridica);

    }






    }
