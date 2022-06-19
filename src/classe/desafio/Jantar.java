package classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Macarrão", 0.856);
        Comida c2 = new Comida("Carne", 0.238);
        Pessoa p1 = new Pessoa("Macaco", 89.8);

        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c2);
        System.out.println(p1.apresentar());


    }
}
