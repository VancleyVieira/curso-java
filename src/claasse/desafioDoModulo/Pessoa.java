package claasse.desafioDoModulo;

public class Pessoa {

    String nomeDaPessoa;
    double pesoDaPessoa;

    Pessoa(String nomeDaPessoa, double pesoDaPessoa) {
        this.nomeDaPessoa = nomeDaPessoa;
        this.pesoDaPessoa = pesoDaPessoa;
    }

    void comer(Comida comida) {
        if(comida != null) {
            this.pesoDaPessoa += comida.pesoDaComida;
        }
    }

    String apresentar() {
        return "Olá eu sou o " + nomeDaPessoa + " e tenho " + pesoDaPessoa + "Kgs";
    }

}
