package fundamentos;

public class Temperatura {
    //Desafio Variaveis e constantes, fazendo a conversação de fahrenheit em graus celcius
    public static void main(String[] args) {
        //Formula (°F - 32) * 5/9 = °C

        final double AJUSTE = 32.0; //Por convenção os nomes de constantes são em maiusculo
        final double FATOR = 5.0 / 9.0;

        double fahrenheit = 86.0;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("A convercao de " + fahrenheit + "F em graus celsius e = " + celsius +"C");

        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("A convercao de " + fahrenheit + "F em graus celsius e = " + celsius +"C");
    }
}
