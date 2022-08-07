package OO.heranca.teste;

import OO.heranca.Direcao;
import OO.heranca.Heroi;
import OO.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;
//
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.LESTE);
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.SUL);


        System.out.println("Life Monstro => " + monstro.vida);
        System.out.println("Life Herói => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Life Monstro => " + monstro.vida);
        System.out.println("Life Herói => " + heroi.vida);

    }
}
