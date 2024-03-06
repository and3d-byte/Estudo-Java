package collections;

import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(1.3);
        conjunto.add(1.4);

        System.out.println(conjunto.size());
        System.out.println(conjunto.remove(1.2));
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains(1.3));
    }
}
