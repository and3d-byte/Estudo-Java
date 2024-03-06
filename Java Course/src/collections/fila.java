package collections;

import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Offer e add
        fila.add("Ana");
        fila.offer("Bia");

        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
    }
}
