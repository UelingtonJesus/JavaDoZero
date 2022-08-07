package OO.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void LigarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
            return 35;
        }
        else if(ligarTurbo){
            return 30;
        }
        else if(!ligarAr){
            return 20;
        }
        else{
            return 15;
        }
    }

    @Override
    public String toString() {
        return "velocidade Ferrari= " + velocidadeAtual+"km/h";
    }


}
