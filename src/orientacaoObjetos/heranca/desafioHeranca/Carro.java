package orientacaoObjetos.heranca.desafioHeranca;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    protected int delta = 5;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void getAcelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            this.velocidadeAtual += delta;
        }
    }

    public void getFrear() {
        if(velocidadeAtual <= 0) {
            this.velocidadeAtual = 0;
        } else {
            this.velocidadeAtual -= 5;
        }
    }

}
