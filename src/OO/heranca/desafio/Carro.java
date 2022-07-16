package OO.heranca.desafio;

public class Carro {
    int velocidadeAtual;

    void acelerar(){
        velocidadeAtual += 5;
    }

    void frear(){
        if(velocidadeAtual < 0)velocidadeAtual=0;
        else velocidadeAtual -= 5;
    }

    @Override
    public String toString() {
        return "velocidadeAtual= " + velocidadeAtual+"km/h";
    }
}
