package controle.desafioDoModulo;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                System.out.printf("O numero *%d* esta entre (0 e 10) e é um numero PAR.", numero);
            }
        }
        System.out.printf("O numero *%d* digitado nao confere com as ordens de estar entre 0 e 10 e ser um numero par", numero);


        entrada.close();
    }
}
