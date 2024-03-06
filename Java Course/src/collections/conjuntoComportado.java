package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {
    public static void main(String[] args) {
        SortedSet<String> lista = new TreeSet<>();
        lista.add("teste");

        for(String candidato : lista){
            System.out.println(candidato);
        }
    }
}
