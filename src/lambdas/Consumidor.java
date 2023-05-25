package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimirNome =
                produto -> System.out.println(produto.nome + "!!!");

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Lapis", 2.99, 0.09);
        Produto p3 = new Produto("Caderno", 30.99, 0.19);
        Produto p4 = new Produto("Borracha", 4.99, 0.05);
        Produto p5 = new Produto("Apontador", 3.98, 0.09);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
