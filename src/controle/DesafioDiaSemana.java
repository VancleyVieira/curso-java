package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

    // Domingo -> 1
    // segunda -> 2
    // ...

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String diaSemana = entrada.next();

        if (diaSemana.equals("Domingo") || diaSemana.equals("domingo")) {
            System.out.println("1");
        } else if (diaSemana.equals("Segunda") || diaSemana.equals("segunda")) {
            System.out.println("2");
        } else if (diaSemana.equals("Terça") || diaSemana.equals("terça")) {
            System.out.println("3");
        } else if (diaSemana.equals("Quarta") || diaSemana.equals("quarta")) {
            System.out.println("4");
        } else if (diaSemana.equals("Quinta") || diaSemana.equals("quinta")) {
            System.out.println("5");
        } else if (diaSemana.equals("Sexta") || diaSemana.equals("sexta")) {
            System.out.println("6");
        } else if (diaSemana.equals("Sábado") || diaSemana.equals("sábado")) {
            System.out.println("7");
        } else {
            System.out.println("Valor invalido");
        }

        System.out.println("FIM!!");
        entrada.close();
    }
}
