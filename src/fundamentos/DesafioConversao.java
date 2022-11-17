package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o salario do primeiro mes: ");
        String primeiroSal = leitura.next().replace("," , ".");

        System.out.println("Digite o salario do segundo mes: ");
        String segundoSal = leitura.next().replace("," , ".");

        System.out.println("Digite o salario do terceiro mes: ");
        String terceiroSal = leitura.next().replace("," , ".");

        double salario1 = Double.parseDouble(primeiroSal);
        double salario2 = Double.parseDouble(segundoSal);
        double salario3 = Double.parseDouble(terceiroSal);

        double mediaSal = (salario1 + salario2 + salario3) / 3;

        System.out.println("A media dos salarios e: " + mediaSal);

        leitura.close();
    }

}
