import java.util.Scanner;

/**
 *  ATENÇÃO: Utilize vírgula nos números com pontos flutuantes.
 */


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("***** Cálculo de médias do Teteu ****  ");

        /**
         * As notas serão digitadas pelo usuário e salvas em uma variável
         */

        System.out.print("Digite sua nota 1:   ");
        Notas nota1 = new Notas(input.nextDouble());
        Double valorNota1 = nota1.getValor();


        System.out.print("Digite sua nota 2:   ");
        Notas nota2 = new Notas(input.nextDouble());
        Double valorNota2 = nota2.getValor();


        System.out.print("Digite sua nota 3:   ");
        Notas nota3 = new Notas(input.nextDouble());
        Double valorNota3 = nota3.getValor();


        System.out.print("Digite sua nota 4:   ");
        Notas nota4 = new Notas(input.nextDouble());
        Double valorNota4 = nota4.getValor();

        /**
         * Realizado a soma das notas, o método para adquirir a média e o resultado é mostrado ao usuário.
         */

        Double totalNotas = valorNota1 + valorNota2 + valorNota3 + valorNota4;

        Double media = nota1.calculoMedia(totalNotas);

        System.out.print("Sua média é: " + media);















        }
    }
