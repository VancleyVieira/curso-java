package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        // Gravando dados do teclado com Scanner

        // Atribuindo que "entrada" irá gravar algo vindo do teclado
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite seu Nome: ");
        String nome = entrada.nextLine(); // nextLine() grava um String

        System.out.printf("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.printf("Digite sua idade: ");
        int idade = entrada.nextInt(); // nextInt() diferente de nextLine() grava um inteiro

        // Imprimindo na tela os resultados
        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        // Encerrando o Scanner
        entrada.close();
    }
}
