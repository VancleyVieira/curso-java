package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        /*
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8,5%) | < 2500 (Isento)
         * 3. Frete: >= 3000 (100) | < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,56
         **/

        Function<Produto, Double> precoReal =
                produto -> produto.preco * (1 - produto.desconto);

        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete =
                valor -> valor >= 3000 ? valor + 100 : valor + 50;

        UnaryOperator<Double> arredondar =
                valor -> Double.parseDouble(String.format("%.2f", valor).replace("," , "."));

        Function<Double, String> formatar =
                valor -> ("R$" + valor).replace("," , ".");

        Produto produto = new Produto("iPad", 3235.89, 0.13);

        String precoFinal = precoReal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(produto);
        System.out.println("O preco final e: " + precoFinal);

    }
}
