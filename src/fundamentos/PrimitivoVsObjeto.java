package fundamentos;

public class PrimitivoVsObjeto {

    public static void main(String[] args) {
        // Tudo em JAVA é objeto MENOS os 8 tipos primitivos

        String s = new String("Texto"); // Forma menos usual de se declarar um valor em uma String, a IDEA deixa até opaco
        s.toUpperCase();

        // Wrappers são a versão objeto dos tipos primitivos
        // Usamos Wrappers quando queremos que um tipo primitivo tenha algum comportamento.
        // existem Wrappers para os 8 tipos primitivos
    }
}
