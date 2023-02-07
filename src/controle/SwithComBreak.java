package controle;

import java.util.Scanner;

public class SwithComBreak {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.print("Digite uma nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1: case 0:
                conceito = "E";
                break;
            default:
                conceito = "Não encontrado";
        }
        System.out.println("Conceito é: " + conceito);

        // Swith com break, mais comum pois dessa forma ele executa apenas um bloco
        // Tambem mostrando que pode agrupar multiplos cases em um unico bloco

        entrada.close();
    }
}
