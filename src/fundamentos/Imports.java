package fundamentos;
// Import da biblioteca para que seja possivel instanciar um objeto Date()
import java.util.Date;

public class Imports {

    public static void main(String[] args) {
        // java.lang todas as classes em java importão por padrão essa biblioteca
        // ou seja não precisa expecificar o tempo todo o caminho inteiro até um metodo desta biblioteca

        java.lang.String b = "Boa Noite!";
        java.lang.System.out.println(b);

        String s = "Bom dia!";
        System.out.println(s);

        Date d = new Date();
        System.out.println(d);
    }

}
