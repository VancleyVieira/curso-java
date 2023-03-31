package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {

        Calculo calc = new Somar();
        System.out.println(calc.executar(2, 3));

        // por conta das duas classes implementarem a interface
        // podemos utilizar do polimorfisco, é o que acontece na linha a baixo
        calc = new Multiplicar();
        System.out.println(calc.executar(2, 3));
    }
}
