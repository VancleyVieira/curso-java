package fundamentos.desafioDoModulo;
/*
    * Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu Peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite sua Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu peso é: %.2f \nSua altura é: %.2f \nSeu indice de massa corporal (IMC) é: %.2f",peso,altura,imc);

        entrada.close();
    }

}
