package collections;

import java.util.HashMap;
import java.util.Map;

public class mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Andre");
        usuarios.put(2, "Jorge");
        usuarios.put(3, "Luis");

        System.out.println(usuarios.size());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Andre"));
        System.out.println(usuarios.get(1));

        for(int chave : usuarios.keySet()){
            System.out.println(chave);
        }

        for(String valor : usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getKey() + " " + registro.getValue());
        }
    }
}
