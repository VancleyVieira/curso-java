package controle;

public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
        /*for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }*/

        // Desafio obter o msm resultado do for de cima porem
        // nao pode usar valor numerico para controlar o laço

        // Minha resposta:
        for (char i = '1'; i <= '5'; i++) {
            System.out.println(valor);
            valor += "#";
        }

        //Correção do professor:
        for (String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}

