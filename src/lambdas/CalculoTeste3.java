package lambdas;

public class CalculoTeste3 {
    public static void main(String[] args) {

        // Utilizando LAMBDA

        Calculo calc = (a, b) -> { return a + b; };
        System.out.println(calc.executar(2, 3));

        // OU

        // de forma mais reduzida ainda sem precisar utilizar as chaves ele ja calcula e retorna o valor
        calc = (a, b) -> a * b;
        System.out.println(calc.executar(2, 3));
    }
}
