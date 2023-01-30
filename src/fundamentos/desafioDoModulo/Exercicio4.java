package fundamentos.desafioDoModulo;

// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite um numero para ser elevado ao Quadrado e ao Cubo: ");
        double numero = entrada.nextDouble();

        double numeroAoQuadrado = Math.pow(numero,2);
        double numeroAoCubo = Math.pow(numero,3);

        System.out.printf("O numero digitado foi: %.2f \nAo Quadrado: %.2f \nAo Cubo: %.2f",numero,numeroAoQuadrado,numeroAoCubo);

        entrada.close();
    }
}
