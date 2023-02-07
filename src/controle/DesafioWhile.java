package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada =new Scanner(System.in);

        double nota = 0;
        double total = 0;
        int qtdNotas = 0;

        do {
            System.out.print("Digite uma nota (ou -1 para sair): ");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                total += nota;
                qtdNotas++;
            } else if (nota != -1){
                System.out.println("Nota Invalida!!!");
            }
        } while (nota != -1);

        double media = total / qtdNotas;

        System.out.printf("A media das notas digitadas é: %.2f", media);

        entrada.close();
    }
}
