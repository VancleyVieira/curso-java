package arrays;

public class Foreach {

    public static void main(String[] args) {

        double[] notas = { 9.9, 8.7, 7.2, 9.4 };

        // Estrutura For Convencional (Classico)
        for(int i = 0; i < notas.length; i++) {
            System.out.printf(notas[i] + " ");
        }

        System.out.println();

        // Estrutura Foreach
        for(double nota: notas) {
            System.out.printf(nota + " ");
        }
    }
}
