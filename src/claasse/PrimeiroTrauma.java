package claasse;

// Desafio imprimir a variavel (a) dentro do matodo main

public class PrimeiroTrauma {
    
    int a = 3; //

    public static void main(String[] args) {

        // é só instancar a classe "PrimeiroTrauma" e pegar o valor de a como referencia
        PrimeiroTrauma primeiroTrauma = new PrimeiroTrauma();

        // Desta forma consigo acessar o atributo da classe Primeiro trauma de dentro de um metodo statico "MAIN"
        System.out.println(primeiroTrauma.a);

    }
}
