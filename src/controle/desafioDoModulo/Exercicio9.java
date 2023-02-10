package controle.desafioDoModulo;

import java.util.Scanner;

//  Crie um programa que recebe 10 valores e ao final imprima o maior número.
public class Exercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int maiorNumero = 0;
        int numeroDigitado = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o numero %d: ",i+1);
            numeroDigitado = entrada.nextInt();

            if (numeroDigitado > maiorNumero) {
                maiorNumero = numeroDigitado;
            }
        }
        System.out.printf("O Maior numero digitado foi: %d", maiorNumero);
        entrada.close();
    }
}
