package orientacaoObjetos.polimorfismo.polimorfismoDinamico;

public class Comida {

    // polimorfismo dinamico consiste em criar uma classe mais generica
    // quando temos duas ou mais classes com os mesmos metodos e atributos
    // criando a classe mais generica, as de mais classes podem assim extender esta classe
    // e no construtor da classe mais especifica chamamos o super() "construtor" da classe generica
    // desta forma reaproveitamos codigo pois ao inves de criar um metodo comer para cada comida diferente
    // criamos o construtor comida da classe mais generica e a partir dela podemos setar n tipos de comida com apenas um metodo

    private double peso;

    public Comida(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }

}
