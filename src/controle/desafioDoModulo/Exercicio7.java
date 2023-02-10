package controle.desafioDoModulo;

import java.util.Scanner;

/*
    * 7. Criar um programa que enquanto estiver recebendo números positivos,
    * imprime no console a soma dos números inseridos, caso receba um número negativo,
    * encerre o programa. Tente utilizar a estrutura do while.
* */

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int somaDosNumeros = 0;
        int numeros = 0;

        do {
            System.out.print("\nDigite um numero POSITIVO (ou negativo se deseja sair): ");
            numeros = entrada.nextInt();

            if(numeros >= 0) {
                somaDosNumeros += numeros;
                System.out.printf("\nA soma dos numeros inseridos sao: %d", somaDosNumeros);
            }

        }while (numeros >= 0);
        entrada.close();
    }
}
