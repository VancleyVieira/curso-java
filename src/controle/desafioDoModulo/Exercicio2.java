package controle.desafioDoModulo;

// Criar um programa informa se o ano atual é um ano bissexto

/*
    OBS: um ano é bissexto se ele for divisível por 400 ou se ele for divisível por 4 e não por 100.
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = entrada.nextInt();

        if (ano % 400 == 0) {
            System.out.printf("O ano de (%d) e bissesto", ano);
        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.printf("O ano de (%d) e bissesto", ano);
        } else {
            System.out.printf("O ano de (%d) NAO e bissesto", ano);
        }
        entrada.close();
    }
}
