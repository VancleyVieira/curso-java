package claasse;

public class Produto {

    String nome;
    double preco;
    static double desconto;

    // construtor padrão
    Produto() {

    }

    // construtor
    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    // Assinatura do metodo = "precoDesconto()"
    double precoDesconto() {
        return preco * (1 - desconto);
    }

    // Mostrando que dois metodos podem ter o mesmo nome
    // Se os parametros forem diferentes
    // Assinatura do metodo = "precoDesconto (double descontoDoGerente)"
    double precoDesconto (double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }

    // metodos podem ter o mesmo nome, mas nunca a mesma assinatura
}
