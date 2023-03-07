package orientacaoObjetos.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        // Relacionamento UM para MUITOS

        Compra compra1 = new Compra();
        compra1.cliente = "Vancley";
        compra1.adicionarItem("Caneta", 20, 7.45);
        compra1.adicionarItem(new Item("Borracha", 10, 5.50));
        compra1.adicionarItem(new Item("Caderno", 3, 25));

        System.out.println("Quantidade de itens no corrinho: " + compra1.itens.size());
        System.out.println("Valor total dos itens no carrinho: " + compra1.getValorTotal());

        // só mostrando a relação bidirecional!!!
        double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
        System.out.println("O total e R$" + total);
    }

}
