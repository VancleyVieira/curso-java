package orientacaoObjetos.emcapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(-45, "Pedro", " da Silva");

        p1.setIdade(230); // altera (set)
        System.out.println(p1.getIdade()); // mostra (get)
        System.out.println(p1); // toString
        System.out.println(p1.getNomeCompleto());
    }
}
