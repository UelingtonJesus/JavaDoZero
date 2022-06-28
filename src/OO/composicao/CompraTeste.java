package OO.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "J Neto";
        compra1.addItem("Caneta", 20, 7.45);
        compra1.addItem(new Item("Borracha", 12, 3.89));
        compra1.addItem(new Item("Caderno", 3, 13.79));

        System.out.println(compra1.itens.size());

        System.out.println(compra1.obterValorTotal());

    }
}
