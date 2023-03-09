package orientacaoObjetos.composicao.desafio;

public class Item {

    final Produto produto;
    int quantidadeDeItens = 0;

    Item(Produto produto, int quantidadeDeItens) {
        this.produto = produto;
        this.quantidadeDeItens = quantidadeDeItens;
    }
}
