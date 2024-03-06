public class Usuarios {

    String nome;
    String email;

    @Override
    public boolean equals(Object obj) {
        Usuarios outro = (Usuarios) obj;
        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailigual = outro.email.equals(this.email);

        return nomeIgual && emailigual;
    }
}
