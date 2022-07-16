package OO.composicao.desafio.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void addItem(String nome, double preco, int qtde){
        this.itens.add(new Item(new Produto(nome, preco), qtde));
    }

    double obterValorItens(){
        double total = 0;
        for(Item item: itens){
            total += item.qtde * item.produto.preco;
        }
        return total;
    }
}
