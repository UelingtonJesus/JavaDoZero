package classe.desafio;

import org.w3c.dom.ls.LSOutput;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida){
        if(comida != null){
            this.peso += comida.peso;
        }
    }

    String apresentar(){
        return String.format("Olá eu sou o "+this.nome+" e tenho %.2f Kgs.", this.peso);
    }
}
