package claasse;

public class AreaCirc {

    double raio;
//  Normalmente um atributo STATICO tambem tende a ser uma constante, por isso a inserção do FINAL
    static final double PI = 3.1415; // por convenção atriutos FINAL são atribuidos em MAIUSCULO

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        //return PI * raio * raio;
        return PI * Math.pow(raio, 2);
    }

    // criando um metodo STATICO eu não preciso criar uma instancia para calcular a area
    // static significa que o atributo ou metodo pertence a CLASSE e NÂO a INSTANCIA
    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
