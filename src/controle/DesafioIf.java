package controle;

public class DesafioIf {
    public static void main(String[] args) {

        // Por que mesmo a nota sendo menor que a condição analisada os printsaparecem no console?
        double nota = 1.3;

        // Por conta deste ; que gera uma inconsistencia no codigo pois nao se deve utilizar ; em estruturadas de controles (salvo uma exceção)
        if (nota >= 9.0); {
            System.out.println("Quadro de Honra");
            System.out.println("Voce e fera!!!");
        }
    }
}
