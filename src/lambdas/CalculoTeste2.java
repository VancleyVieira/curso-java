package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo calc = (a, b) -> { return a + b; };
        System.out.println(calc.executar(2, 3));

        // de forma mais reduzida ainda sem precisar utilizar as chaves ele ja calcula e retorna o valor
        calc = (a, b) -> a * b;
        System.out.println(calc.executar(2, 3));
    }
}
