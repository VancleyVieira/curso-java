package orientacaoObjetos.polimorfismo.polimorfismoDinamico;

public class Jantar {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(99.65);

        Arroz arroz = new Arroz(0.2);
        pessoa.comer(arroz);
        System.out.println(pessoa.getPeso());

        Feijao feijao = new Feijao(0.1);
        pessoa.comer(feijao);
        System.out.println(pessoa.getPeso());

        Sorvete sorvete = new Sorvete(0.4);
        pessoa.comer(sorvete);
        System.out.println(pessoa.getPeso());

        Comida ingrediente3 = new Arroz(0.3);
        pessoa.comer(ingrediente3);
        System.out.println(pessoa.getPeso());
    }
}
