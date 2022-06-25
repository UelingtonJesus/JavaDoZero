package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados2 = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");
        listaAprovados.add("Pedro");
        listaAprovados2.add("Ana");
        listaAprovados2.add("Carlos");
        listaAprovados2.add("Lucas");
        listaAprovados2.add("Pedro");

        for (String candidato:listaAprovados
             ) {
            System.out.println("Lista1: "+candidato);
        }
        for (String candidato:listaAprovados2
             ) {
            System.out.println("--Lista2: "+candidato);
        }
    }
}
