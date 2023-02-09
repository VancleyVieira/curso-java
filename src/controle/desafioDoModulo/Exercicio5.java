package controle.desafioDoModulo;

// 5. Refatorar o exercício 04, utilizando a estrutura switch.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        int contadorDeDivisores = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para verificar se e primo: ");
        int numero = scanner.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDeDivisores++;
            }
        }

        switch (contadorDeDivisores) {
            case 0:
                System.out.println("\nO numero " + numero + " e primo.");
                break;
            default:
                System.out.println("\nO numero " + numero + " nao e primo.");
        }

        scanner.close();

    }
}
