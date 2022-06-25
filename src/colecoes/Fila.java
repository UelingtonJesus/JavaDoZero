package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");//Retorna false
        fila.offer("Bia");//Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafa");
        fila.offer("Gui");

        System.out.println(fila.peek());//Retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element());//Lança uma exceção
        System.out.println(fila.element());

        System.out.println(fila.poll());
        System.out.println(fila.poll());//Retorna null
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
//        System.out.println(fila.poll());
//        System.out.println(fila.poll());

        System.out.println(fila.remove());//Lança uma exceção
    }
}
