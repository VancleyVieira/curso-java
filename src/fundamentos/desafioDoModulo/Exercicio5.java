package fundamentos.desafioDoModulo;

// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o valor da base do triangulo: ");
        double base = entrada.nextDouble();

        System.out.printf("Digite o valor da altura do triangulo: ");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("O triangulo com base igual a: %.2f e altura igual a: %.2f tem como area o valor de: %.2f",base,altura,area);

        entrada.close();
    }
}
