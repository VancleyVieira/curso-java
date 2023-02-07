package controle;

import java.util.Locale;

public class SwithSemBreak {
    public static void main(String[] args) {

        // Muito raro o uso do Swith sem o break pois dessa forma assim que
        // encontrar uma condição verdadeira, tudo que estiver a baixo é executado
        // de forma acumulativa, este é um bom exemplo utilizando faixar do caratê

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei fazer o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Não sei nada");
        }
        System.out.println("Fim!");

        int idade = 1;

        switch (idade) {
            case 3:
                System.out.println("Sabe Programar");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Sabe Respirar");
        }
    }
}
