package orientacaoObjetos.heranca.desafioHeranca;

public class Ferrai extends Carro {

    Ferrai() {
        this(315);
    }

    Ferrai(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }

//    void getAcelerar() {
//        velocidadeAtual += 15;
//    }
}
