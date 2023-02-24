package claasse;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object objeto) {
        // (instanceof) = instancia de ...
        if (objeto instanceof Usuario) {
            Usuario outroUsuario = (Usuario) objeto;

            boolean nomeIgual = outroUsuario.nome.equals(this.nome);
            boolean emailIgual = outroUsuario.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }

    // O hashCode sera abordado na proxima aula!
    public int hashCode() {
        return 0;
    }
}
