package controle;

public class Break {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if ((i == 5)) {
                break; // O break interrompe a interação, quando executado joga o fluxo do programa para fora do for
            }
            System.out.println(i);
        }
        System.out.println("FIM!");
    }
}
