package OO.heranca.desafio;

public class Ferrari extends Carro{
    @Override
    void acelerar(){
        velocidadeAtual += 15;
    }

    @Override
    public String toString() {
        return "velocidade Ferrari= " + velocidadeAtual+"km/h";
    }


}
