package controle;

public class ContinueRotulado {
    public static void main(String[] args) {
        // Continue rotulado NAO é muito indicado, pois pode deixar o codigo muito
        // complicado de entender e gerar confusão, muitas vezes quando necessario usa-se outras formas.

        // criando o rotulo "externo" eu consigo indicar para o Continue exatamente o for que é para ele pular determinada execução
        externo: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    continue externo; // se nao tivesse o rotulo "externo", o continue pularia a execução do for de dentro por padrão
                }
                System.out.printf("I[%d] J[%d] ", i, j);
            }
            System.out.println();
        }
        System.out.println("FIM!");
    }
}
