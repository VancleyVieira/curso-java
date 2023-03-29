package orientacaoObjetos.polimorfismo.polimorfismoEstatico;

import orientacaoObjetos.polimorfismo.polimorfismoDinamico.Arroz;
import orientacaoObjetos.polimorfismo.polimorfismoDinamico.Feijao;
import orientacaoObjetos.polimorfismo.polimorfismoDinamico.Pessoa;
import orientacaoObjetos.polimorfismo.polimorfismoDinamico.Sorvete;

public class Jantar {

    public static void main(String[] args) {

        orientacaoObjetos.polimorfismo.polimorfismoDinamico.Pessoa pessoa = new Pessoa(99.65);

        orientacaoObjetos.polimorfismo.polimorfismoDinamico.Arroz arroz = new Arroz(0.2);
        orientacaoObjetos.polimorfismo.polimorfismoDinamico.Feijao feijao = new Feijao(0.1);

        System.out.println(pessoa.getPeso());

        pessoa.comer(arroz);
        pessoa.comer(feijao);
        System.out.println(pessoa.getPeso());

        orientacaoObjetos.polimorfismo.polimorfismoDinamico.Sorvete sorvete = new Sorvete(0.4);

        pessoa.comer(sorvete);
        System.out.println(pessoa.getPeso());
    }
}
