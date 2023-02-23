package arrays;

import java.util.Scanner;

public class ExercicioArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Ola, Quantas notas Deseja informar para o calculo da media?: ");
        int quantidadeDeNotas = entrada.nextInt();

        double[] notas = new double[quantidadeDeNotas];

        for (int i = 0; i < quantidadeDeNotas; i++) {
            System.out.printf("Informe a nota %d: ", i + 1);
            double notaInformada = entrada.nextDouble();
            notas[i] += notaInformada;
        }

        double somaNotas = 0;
        for (double notaInformada: notas) {
            somaNotas += notaInformada;
        }
        System.out.println("Media das notas: " + somaNotas / notas.length);

        entrada.close();
    }
}
