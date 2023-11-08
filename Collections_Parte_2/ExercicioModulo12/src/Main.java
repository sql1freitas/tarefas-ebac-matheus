import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /**
         * @author Matheus
         * Início do programa criando os objetos padrões
         */

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();
        Pessoa pessoa5 = new Pessoa();

        List listaMasculina = new ArrayList();
        List listaFeminina = new ArrayList();
        List outro = new ArrayList<>();

        Scanner input = new Scanner(System.in);


        /**
         * Aquisição das informações do usuário para alimentar a lista
         * Lógica para definir o atributo sexo de maneira mais simples para evitar erros.
         */

        System.out.println("**** Cadastro de 5 Pessoas ****");
        System.out.println("Digite o nome da primeira pessoa:");
        pessoa1.setNome(input.next());
        System.out.println("Essa pessoa é do sexo Masculino(1), Feminino(2), Outro(3)? (Responda com o respectivo número): ");
        Integer sexoPessoa1 = input.nextInt();
        if (sexoPessoa1 == 1){
            pessoa1.setSexo("masculino");
        } else if (sexoPessoa1 == 2) {
            pessoa1.setSexo("feminino");
        } else if (sexoPessoa1 == 3) {
            pessoa1.setSexo("Outro");
        } else {
            System.out.println("Opção inválida! - Reinicie o programa");
        }

        System.out.println("Digite o nome da segunda pessoa:");
        pessoa2.setNome(input.next());
        System.out.println("Essa pessoa é do sexo Masculino(1), Feminino(2), Outro(3)? (Responda com o respectivo número): ");
        Integer sexoPessoa2 = input.nextInt();
        if (sexoPessoa2 == 1){
            pessoa2.setSexo("masculino");
        } else if (sexoPessoa2 == 2) {
            pessoa2.setSexo("Feminino");
        } else if (sexoPessoa2 == 3) {
            pessoa2.setSexo("Outro");
        } else {
            System.out.println("Opção inválida! - Reinicie o programa");
        }

        System.out.println("Digite o nome da terceira pessoa:");
        pessoa3.setNome(input.next());
        System.out.println("Essa pessoa é do sexo Masculino(1), Feminino(2), Outro(3)? (Responda com o respectivo número): ");
        Integer sexoPessoa3 = input.nextInt();
        if (sexoPessoa3 == 1){
            pessoa3.setSexo("masculino");
        } else if (sexoPessoa3 == 2) {
            pessoa3.setSexo("Feminino");
        } else if (sexoPessoa3 == 3) {
            pessoa3.setSexo("Outro");
        } else {
            System.out.println("Opção inválida! - Reinicie o programa");
        }

        System.out.println("Digite o nome da quarta pessoa:");
        pessoa4.setNome(input.next());
        System.out.println("Essa pessoa é do sexo Masculino(1), Feminino(2), Outro(3)? (Responda com o respectivo número): ");
        Integer sexoPessoa4 = input.nextInt();
        if (sexoPessoa4 == 1){
            pessoa4.setSexo("masculino");
        } else if (sexoPessoa4 == 2) {
            pessoa4.setSexo("Feminino");
        } else if (sexoPessoa4 == 3) {
            pessoa4.setSexo("Outro");
        } else {
            System.out.println("Opção inválida! - Reinicie o programa");
        }

        System.out.println("Digite o nome da quinta pessoa:");
        pessoa5.setNome(input.next());
        System.out.println("Essa pessoa é do sexo Masculino(1), Feminino(2), Outro(3)? (Responda com o respectivo número): ");
        Integer sexoPessoa5 = input.nextInt();
        if (sexoPessoa5 == 1){
            pessoa5.setSexo("masculino");
        } else if (sexoPessoa5 == 2) {
            pessoa5.setSexo("Feminino");
        } else if (sexoPessoa5 == 3) {
            pessoa5.setSexo("Outro");
        } else {
            System.out.println("Opção inválida! - Reinicie o programa");
        }


        /**
         * Lógica para comparação usando método Equals que adicionará os
         * objetos em suas respectivas listas.
         */

        System.out.println("Aqui estão a lista com as pessoas separadas por sexo: ");

        if (pessoa1.getSexo().equalsIgnoreCase("Masculino")){
            listaMasculina.add(pessoa1);
        } else if (pessoa1.getSexo().equalsIgnoreCase("Feminino")) {
            listaFeminina.add(pessoa1);
        } else if (pessoa1.getSexo().equalsIgnoreCase("Outro")) {
            outro.add(pessoa1);
        }

        if (pessoa2.getSexo().equalsIgnoreCase("Masculino")){
            listaMasculina.add(pessoa2);
        } else if (pessoa2.getSexo().equalsIgnoreCase("Feminino")) {
            listaFeminina.add(pessoa2);
        } else if (pessoa2.getSexo().equalsIgnoreCase("Outro")) {
            outro.add(pessoa2);
        }

        if (pessoa3.getSexo().equalsIgnoreCase("Masculino")){
            listaMasculina.add(pessoa3);
        } else if (pessoa3.getSexo().equalsIgnoreCase("Feminino")) {
            listaFeminina.add(pessoa3);
        } else if (pessoa3.getSexo().equalsIgnoreCase("Outro")) {
            outro.add(pessoa3);
        }

        if (pessoa4.getSexo().equalsIgnoreCase("Masculino")){
            listaMasculina.add(pessoa4);
        } else if (pessoa4.getSexo().equalsIgnoreCase("Feminino")) {
            listaFeminina.add(pessoa4);
        } else if (pessoa4.getSexo().equalsIgnoreCase("Outro")) {
            outro.add(pessoa4);
        }

        if (pessoa5.getSexo().equalsIgnoreCase("Masculino")){
            listaMasculina.add(pessoa5);
        } else if (pessoa5.getSexo().equalsIgnoreCase("Feminino")) {
            listaFeminina.add(pessoa5);
        } else if (pessoa5.getSexo().equalsIgnoreCase("Outro")) {
            outro.add(pessoa5);
        }

        System.out.println("Lista Masculina:" +listaMasculina);
        System.out.println("Lista Feminina:" +listaFeminina);
        System.out.println("Outro:" + outro);
    }
    }
