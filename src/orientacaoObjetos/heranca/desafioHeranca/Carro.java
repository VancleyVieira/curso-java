package orientacaoObjetos.heranca.desafioHeranca;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual;
    int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void getAcelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            this.velocidadeAtual += delta;
        }
    }

    void getFrear() {
        if(velocidadeAtual <= 0) {
            this.velocidadeAtual = 0;
        } else {
            this.velocidadeAtual -= 5;
        }
    }

}
