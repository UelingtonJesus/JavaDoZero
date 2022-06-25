package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

       List<Usuario> lista = new ArrayList<>();


        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("lia"));
        lista.add(new Usuario("fgfd"));
        lista.add(new Usuario("rfgrwe"));
        lista.add(new Usuario("fdvsv"));

        System.out.println(lista.get(2));

        lista.remove(2);
        lista.remove(new Usuario("Ana"));

        System.out.println("Tem? "+lista.contains(new Usuario("Carlos")));
        for (Usuario u:lista
             ) {
            System.out.println(u.nome);
        }


    }
}
