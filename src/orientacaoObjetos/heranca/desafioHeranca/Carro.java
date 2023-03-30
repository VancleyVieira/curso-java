package orientacaoObjetos.heranca.desafioHeranca;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual;
    private int delta = 5;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void getAcelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            this.velocidadeAtual += getDelta();
        }
    }

    public void getFrear() {
        if(velocidadeAtual <= 0) {
            this.velocidadeAtual = 0;
        } else {
            this.velocidadeAtual -= 5;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
