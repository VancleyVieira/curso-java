package lambdas;

@FunctionalInterface
public interface Calculo { // Uma interface Funcional pode ter apenas um metodo "ABSTRATO"

    double executar(double a, double b); // metodo abstrato(sem implementação) a lambda vai utilizar ele

    // metodos default e staticos são uma excecão dessa regra

//    default String legal() {
//        return "Legal";
//    }
//
//    static String muitoLegal() {
//        return "Muito Legal";
//    }
}
