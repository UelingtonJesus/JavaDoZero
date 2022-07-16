package OO.composicao.desafio.desafio;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Kasekagi");
        Cliente cliente2 = new Cliente("Hokagi");

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.addItem("Carro",58.956,1);
        compra1.addItem("Moto",8.956,1);
        compra2.addItem("Carro",58.956,1);
        compra2.addItem("Moto",16.956,1);
        compra2.addItem("Barco",158.956,1);

        cliente1.addCompra(compra1);
        cliente2.addCompra(compra2);

        System.out.println(cliente1.obterValorCompra());
        System.out.println(cliente2.obterValorCompra());
    }
}
