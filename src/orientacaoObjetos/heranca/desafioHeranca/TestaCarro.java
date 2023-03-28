package orientacaoObjetos.heranca.desafioHeranca;

public class TestaCarro {
    public static void main(String[] args) {

        Ferrai ferrai = new Ferrai();
        ferrai.velocidadeAtual = 0;


        Fusca fusca = new Fusca();
        fusca.velocidadeAtual = 0;

        ferrai.getAcelerar();
        ferrai.getAcelerar();
        ferrai.getAcelerar();
        ferrai.getAcelerar();
        ferrai.getAcelerar();

        fusca.getAcelerar();
        fusca.getAcelerar();
        fusca.getAcelerar();
        fusca.getAcelerar();
        fusca.getAcelerar();

        System.out.println("Velocidade Ferrari: " + ferrai.velocidadeAtual);
        System.out.println("Velocidade Fusca: " + fusca.velocidadeAtual);

        ferrai.getFrear();
        ferrai.getFrear();

        fusca.getFrear();
        fusca.getFrear();
        fusca.getFrear();
        fusca.getFrear();
        fusca.getFrear();
        fusca.getFrear();

        System.out.println("Velocidade Ferrari: " + ferrai.velocidadeAtual);
        System.out.println("Velocidade Fusca: " + fusca.velocidadeAtual);

    }
}
