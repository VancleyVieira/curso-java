package controle.desafioDoModulo;

import java.util.Scanner;

// Criar um programa que receba uma palavra e imprime no console letra por letra.

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palava: ");
        String palavra = entrada.next();

        int qtd = palavra.length();

        for(int i = 0; i < qtd; i++) {
            System.out.print(palavra.charAt(i) + " ");
        }
        entrada.close();
    }
}
