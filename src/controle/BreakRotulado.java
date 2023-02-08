package controle;

public class BreakRotulado {
    public static void main(String[] args) {
        // Break rotulado assim como o break mas principalemnte o rotulado NAO é muito indicado, pois pode deixar o codigo muito
        // complicado de entender e gerar confusão, muitas vezes quando necessario usa-se outras formas.
        externo: for (int i = 0; i < 3; i++) { // criando o rotulo "externo" eu consigo indicar para o break exatamente o for que é para ele sair fora
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    break externo; // se nao tivesse o rotulo "externo", o break pararia a execução do for de dentro
                }
                System.out.printf("I[%d] J[%d] ", i, j);
            }
            System.out.println();
        }
        System.out.println("FIM!");
    }
}
