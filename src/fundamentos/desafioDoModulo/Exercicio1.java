package fundamentos.desafioDoModulo;

// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
// Formula para converção °C = [(°F-32)×5]/9

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Graus Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();

        //°C = [(°F-32)×5]/9
        double celcius = ((fahrenheit - 32)*5)/9;

        System.out.printf("Graus em fahrenheit: %.2f °F convertido em Graus Celcius: %.2f °C",fahrenheit,celcius);

        entrada.close();
    }
}
