package orientacaoObjetos.heranca.desafioHeranca;

public class Carro {

    public int velocidade;

    void getAcelerar() {
        this.velocidade += 5;
    }
    void getFrear() {
        if(velocidade <= 0) {
            this.velocidade = 0;
        } else {
            this.velocidade -= 5;
        }
    }

}
