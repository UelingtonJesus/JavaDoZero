package OO.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Carro civic = new Honda();

        civic.acelerar();
        System.out.println(civic);
        civic.acelerar();
        System.out.println(civic);
        civic.acelerar();
        System.out.println(civic);


        Carro ferrari = new Ferrari();
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.acelerar();
        System.out.println(ferrari);




    }
}
