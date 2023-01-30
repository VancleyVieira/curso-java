package fundamentos.desafioDoModulo;

/*
    * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
    * utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //double a = 1;
        //double b = 12;
        //double c = -13;

        System.out.printf("\nDigite o valor de A: ");
        double a = entrada.nextDouble();

        System.out.printf("\nDigite o valor de B: ");
        double b = entrada.nextDouble();

        System.out.printf("\nDigite o valor de C: ");
        double c = entrada.nextDouble();

        double delta = (Math.pow(b,2)) - (4 * a * c);

        System.out.printf("\nSua equação é: %.2fx².2 + %.2fx + %.2f = 0", a, b, c);

        System.out.println("\nO delta é: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nO x2 da equação é: %.2f" ,x2);

        entrada.close();
    }
}
