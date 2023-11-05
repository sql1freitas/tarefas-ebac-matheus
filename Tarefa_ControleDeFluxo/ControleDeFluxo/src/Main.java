import java.util.Scanner;

/**
 * @author Matheus
 * UTILIZAR SOMENTE VÍRGULA EM NÚMEROS FLOAT
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * Apresentação do programa e aquisição dos dados pelo usuário
          */

    System.out.println("**** CÁLCULO DE MÉDIA ****");
    System.out.println(" ");


    System.out.println("Digite sua 1º nota: ");
    Double primeiraNota = input.nextDouble();

    System.out.println("Digite sua 2º nota: ");
    Double segundaNota = input.nextDouble();

    System.out.println("Digite sua 3º nota: ");
    Double terceiraNota = input.nextDouble();

    System.out.println("Digite sua 4º nota: ");
    Double quartaNota = input.nextDouble();

    Double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
    System.out.println("Sua média foi de: " + media);


        /**
         * Implementação da lógica para a demonstração do resultado
         */

    if (media >= 7 && media <= 10) {
        System.out.println("Você foi aprovado!");
    } else if (media >= 5 && media < 7) {
        System.out.println("Você está de recuperação!");
    } else if (media > 10) {
        System.out.println("As notas são somente de 0 a 10!");
    } else {
        System.out.println("Você foi reprovado!");
    }


    }
}