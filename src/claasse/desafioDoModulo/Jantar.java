package claasse.desafioDoModulo;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.250);
        Comida c2 = new Comida("Feijao", 0.100);
        Comida c3 = new Comida("Biffe", 0.200);

        Pessoa p1 = new Pessoa("Vancley", 50.0);

        System.out.println(p1.apresentar());

        p1.comer(c1);
        System.out.println(p1.apresentar());

        p1.comer(c2);
        System.out.println(p1.apresentar());

        p1.comer(c3);
        System.out.println(p1.apresentar());
    }
}
