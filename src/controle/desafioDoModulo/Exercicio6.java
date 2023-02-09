package controle.desafioDoModulo;

/*
    6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
    Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas
    para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
    de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
 */

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random random = new Random();

        int numeroAleatorio = random.nextInt(101); // gera um numero aleatorio entreo 0 e 100

        int tentativasRestantes = 10;

        System.out.println("******** Encontre o numero perdido entre 0 - 100 ********");

        for(int i = 0; i <= 10; i++){
            System.out.print("\nO numero e: ");
            int numeroDigitado = entrada.nextInt();
            tentativasRestantes--;

            if (numeroDigitado == numeroAleatorio) {
                System.out.printf("\nPARABENS!! O numero %d foi encontrado com %d tentativas restantes", numeroAleatorio, tentativasRestantes);
                break;
            }

            if (numeroDigitado > numeroAleatorio) {
                System.out.println("\nDICA: O numero que esta procurando e MENOR que o numero que digitou");
            } else {
                System.out.println("\nDICA: O numero que esta procurando e MAIOR que o numero que digitou");
            }
            System.out.printf("\nVoce tem (%d) tentativas restantes", tentativasRestantes);
        }
        System.out.println("\nFIM!");
        entrada.close();
    }
}
