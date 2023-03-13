package orientacaoObjetos.composicao.desafio;

public class Item {

    final Produto produto;
    int quantidadeDeItens;

    Item(Produto produto, int quantidadeDeItens) {
        this.produto = produto;
        this.quantidadeDeItens = quantidadeDeItens;
    }
}
