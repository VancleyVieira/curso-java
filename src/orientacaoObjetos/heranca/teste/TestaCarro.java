package orientacaoObjetos.heranca.teste;

import orientacaoObjetos.heranca.desafioHeranca.Ferrari;
import orientacaoObjetos.heranca.desafioHeranca.Fusca;

public class TestaCarro {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        ferrari.velocidadeAtual = 0;

        ferrari.getAcelerar();

        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);
        System.out.println(ferrari.velocidadeDoAr());

        ferrari.ligarAr();
        ferrari.ligarTurbo();
        ferrari.getAcelerar();

        ferrari.desligarAr();
        ferrari.getAcelerar();

        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);

        ferrari.getFrear();
        ferrari.getFrear();

        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);


        Fusca fusca = new Fusca();
        fusca.velocidadeAtual = 0;

        fusca.getAcelerar();
        fusca.getAcelerar();
        fusca.getAcelerar();
        fusca.getAcelerar();
        fusca.getAcelerar();

        System.out.println("Velocidade Fusca: " + fusca.velocidadeAtual);

        fusca.getFrear();
        fusca.getFrear();
        fusca.getFrear();
        fusca.getFrear();

        System.out.println("Velocidade Fusca: " + fusca.velocidadeAtual);

    }
}
