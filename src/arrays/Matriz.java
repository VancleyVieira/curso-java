package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int quantidadeAlunos = entrada.nextInt();

        System.out.print("Qauntidade de notas por alunos? ");
        int quantidadeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j <notasDaTurma[i].length; j++) {

                System.out.printf("Informe a nota %d do aluno %d: ", i + 1, j + 1);
                notasDaTurma[i][j] = entrada.nextDouble(); // guardando os dados do console na matriz

                total += notasDaTurma[i][j]; // somando as notas dos alunos na variavel total
            }
        }

        double media = total / (quantidadeAlunos * quantidadeNotas);
        System.out.println("Media da turma: " + media);

        for (double[] notasDoAluno: notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();
    }
}
