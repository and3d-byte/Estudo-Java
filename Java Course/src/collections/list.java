package collections;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("André"));
        lista.add(new Usuario("Luis"));
        lista.add(new Usuario("Guilherme"));

        for (Usuario u : lista){
            System.out.println(u);
        }
    }
}
