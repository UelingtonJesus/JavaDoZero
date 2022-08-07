package OO.heranca.desafio;

public class Honda extends Carro{

    public Honda(){
        super(190);
    }
    @Override
    public String toString() {
        return "velocidade Honda= " + velocidadeAtual+"km/h";
    }
}
