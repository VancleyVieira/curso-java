package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicatoComposicao {
    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num %2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        // Composição de Funcoes
        // Com Predicate podemos trabalhar com os operadores (and = &&, or = || e negate = !)

        System.out.println(isPar.negate().test(123)); // retorna true pq apesar de 123 ser impar utilizamos o operafor negate()
        System.out.println(isPar.and(isTresDigitos).test(122)); // retorna true pq o numero é par e tem 3 digitos
        System.out.println(isPar.or(isTresDigitos).test(1)); // retorna false pq o operador or analisa que o numero nao é nem Par e nem tem 3 digitos

    }
}
