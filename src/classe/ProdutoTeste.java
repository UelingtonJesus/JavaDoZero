package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome="Caneta";
        p1.preco = 25.6;

        Produto p2 = new Produto("Notebook",1456.8);

        Produto.desconto = 0.50;

        double precoFinal1 = p1.produtoComDesconto();
        double precoFinal2 = p2.produtoComDesconto();
        System.out.printf(p1.nome+" Valor final R$%.2f\n", precoFinal1);
        System.out.printf(p2.nome+" Valor final R$%.2f\n", precoFinal2);
    }
}
