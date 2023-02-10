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

        int i = 0;
        do {

            System.out.println("Digite um numero: ");
            int numeros = entrada.nextInt();

            int somaDosNumeros = 0;
            if(numeros > 0) {
                somaDosNumeros = somaDosNumeros = numeros;
            } else {

                if (numeros < 0) {
                    System.out.printf("A soma dos numeros inseridos sao: %d", somaDosNumeros);
                    break;
                }
            }

            i++;
        }while (i > 0);



        entrada.close();
    }
}
