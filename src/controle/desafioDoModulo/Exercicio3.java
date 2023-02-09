package controle.desafioDoModulo;

/*
    Criar um programa que receba duas notas parciais, calcular a média final.
    Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
    se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
    caso contrário imprime no console "Reprovado".
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = entrada.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 7.0) {
            System.out.printf("Aluno Com media %.2f APROVADO!!", media);
        } else if (media < 7 && media > 4) {
            System.out.printf("Aluno Com media %.2f RECUPERACAO!!", media);
        } else {
            System.out.printf("Aluno com media %.2f REPROVADO!! Estude mais",media);
        }

        entrada.close();
    }
}
