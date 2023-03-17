package orientacaoObjetos.heranca.desafioHeranca;

public class TestaCarro {
    public static void main(String[] args) {

        Ferrai ferrai = new Ferrai();
        ferrai.velocidade = 0;


        Fusca fusca = new Fusca();
        fusca.velocidade = 0;

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

        System.out.println("Velocidade Ferrari: " + ferrai.velocidade);
        System.out.println("Velocidade Fusca: " + fusca.velocidade);

        ferrai.getFrear();
        ferrai.getFrear();

        fusca.getFrear();
        fusca.getFrear();
        fusca.getFrear();
        fusca.getFrear();
        fusca.getFrear();

        System.out.println("Velocidade Ferrari: " + ferrai.velocidade);
        System.out.println("Velocidade Fusca: " + fusca.velocidade);

    }
}
