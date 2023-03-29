package orientacaoObjetos.heranca.desafioHeranca;

public class Ferrai extends Carro {

    public Ferrai() {
        this(315);
    }

    public Ferrai(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }

//    public void getAcelerar() {
//        velocidadeAtual += 15;
//    }
}
