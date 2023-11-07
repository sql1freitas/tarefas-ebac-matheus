
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * PARTE 1 DO EXERCÍCIO
         */

        Pessoas pessoa1 = new Pessoas();
        Pessoas pessoa2 = new Pessoas();
        Pessoas pessoa3 = new Pessoas();

        pessoa1.setNome("Matheus Felipe");
        pessoa2.setNome("Ana Carolina");
        pessoa3.setNome("Theodoro");
        pessoa1.setSexo("M");
        pessoa2.setSexo("F");
        pessoa3.setSexo("M");

        List lista = new ArrayList<>();

        lista.add(pessoa1.getNome());
        lista.add(pessoa2.getNome());
        lista.add(pessoa3.getNome());

        Collections.sort(lista);

        System.out.println(lista);

        /**
         * PARTE 2 DO EXERCÍCIO
         */

        List listaMasculina = new ArrayList<>();
        List listaFeminina = new ArrayList<>();

        if (pessoa1.getSexo().equalsIgnoreCase("M")) {
            listaMasculina.add(pessoa1);
        } else if (pessoa1.getSexo().equalsIgnoreCase("F")) {
            listaFeminina.add(pessoa1);
        } else {
            System.out.println("Sexo indefinido");
        }

        if (pessoa2.getSexo().equalsIgnoreCase("M")) {
            listaMasculina.add(pessoa2);
        } else if (pessoa2.getSexo().equalsIgnoreCase("F")) {
            listaFeminina.add(pessoa2);
        } else {
            System.out.println("Sexo indefinido");
        }

        if (pessoa3.getSexo().equalsIgnoreCase("M")) {
            listaMasculina.add(pessoa3);
        } else if (pessoa3.getSexo().equalsIgnoreCase("F")) {
            listaFeminina.add(pessoa3);
        } else {
            System.out.println("Sexo indefinido");
        }

        System.out.println("Lista masculina: " + listaMasculina);
        System.out.println("Lista feminina: " + listaFeminina);
    }
    }
