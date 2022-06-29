package OO.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Jó");
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();
        compra1.addItem("Melancia", 8.45, 1);
        compra1.addItem("Morango", 10, 2);
        compra2.addItem("Maçã", 5.49, 1);
        compra2.addItem("Manga", 6.78, 1);

        cliente.addCompra(compra1);
        cliente.addCompra(compra2);

        System.out.println(cliente.obterValorTotal());
        System.out.println(compra1.obterValorTotal());
        System.out.println(compra2.obterValorTotal());

    }
}
