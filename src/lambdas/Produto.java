package lambdas;

// Toda classe em java extende de Object
public class Produto extends Object {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return nome + " Tem preco final de R$ " + precoFinal;
    }


}
