package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        // imprime o array
        System.out.println(Arrays.toString(notasAlunoA));
        // imprime a primeira posição do array
        System.out.println(notasAlunoA[0]);
        // imprime a ultima posição do array
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double totalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA / notasAlunoA.length);

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10}; // tambem podemos passar variaveis e constantes dentro do array

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
