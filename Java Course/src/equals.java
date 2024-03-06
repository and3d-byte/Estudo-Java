public class equals {
    public static void main(String[] args) {
        Usuarios u1 = new Usuarios();
        u1.nome = "teste";
        u1.email = "teste@teste";

        Usuarios u2 = new Usuarios();
        u2.nome = "teste";
        u2.email = "teste@teste";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
