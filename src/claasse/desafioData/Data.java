package claasse.desafioData;

public class Data {

    int dia;
    int mes;
    int ano;

    Data() { // construtor padrao
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
