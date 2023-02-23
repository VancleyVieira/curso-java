package arrays;

// Desafio consistem em pefar a classe (Exercicio) e transformar todos os For em Foreach
public class ExercicioForeach {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        /* Feito com o For Classico:
        double totalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA / notasAlunoA.length);
        */

        double totalAlunoA = 0;
        // Utilizando Foreach:
        for(double notaAulunoA: notasAlunoA) {
            totalAlunoA += notaAulunoA;
        }
        System.out.println(totalAlunoA / notasAlunoA.length);

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10}; // tambem podemos passar variaveis e constantes dentro do array

        double totalAlunoB = 0;
        // Utilizando Foreach:
        for (double notaAlunoB: notasAlunoB) {
            totalAlunoB += notaAlunoB;
        }
        double mediaAuluno = totalAlunoB / notasAlunoB.length;
        System.out.println(mediaAuluno);
    }
}
