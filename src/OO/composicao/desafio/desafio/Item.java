package OO.composicao.desafio.desafio;

public class Item {
    final int qtde;
    Produto produto;

    Item(Produto produto, int qtde){
       this.produto = produto;
       this.qtde = qtde;
    }
}
