package claasse.desafioData;

public class Data {

    int dia;
    int mes;
    int ano;

    String obterDataFormatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
