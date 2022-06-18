package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;
    Produto(){

    }
    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    double produtoComDesconto(){
        return preco * (1-desconto);
    }
    double produtoComDesconto(double descontoDoGerente){
        return preco * (1-(desconto+descontoDoGerente));
    }
}
