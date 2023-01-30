package fundamentos.desafioDoModulo;

/*
    * Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Graus Celcius: ");
        double celcius = entrada.nextDouble();

        // F = C x 1.8 + 32
        double fahrenheit = celcius * 1.8 + 32;

        System.out.printf("Graus em Celcius: %.2f °F convertido em Graus Fahrenheit: %.2f °C",celcius,fahrenheit);

        entrada.close();
    }
}
