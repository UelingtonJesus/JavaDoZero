package OO.heranca.teste;

import OO.heranca.desafio.Carro;
import OO.heranca.desafio.Ferrari;
import OO.heranca.desafio.Honda;

public class CarroTeste{
    public static void main(String[] args) {

//        Carro civic = new Honda();
//
//        civic.acelerar();
//        System.out.println(civic);
//        civic.acelerar();
//        System.out.println(civic);
//        civic.acelerar();
//        System.out.println(civic);


        Ferrari ferrari = new Ferrari(400);
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.ligarTurbo();
        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.desligarTurbo();
        ferrari.acelerar();
        System.out.println(ferrari);




    }
}
