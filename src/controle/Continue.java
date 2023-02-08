package controle;

public class Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue; // O continue interrompe determinada exacução, quando executado joga o fluxo do programa para dentro do for
            }
            System.out.println(i);
        }
        System.out.println("----------------");

        for (int i = 1; i < 10; i++) {
            if(i == 5) { // quando i for igual a 5
                continue; // O continue pula a execução de volta pra o for e não imprime o 5
            }
            System.out.println(i);
        }
    }
}
