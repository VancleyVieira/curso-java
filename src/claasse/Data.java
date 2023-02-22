package claasse;

/*
* Usos da notação THIS:
* para diferenciar uma variavel de instancia e uma variavel de classe
* para chamar um construtor dentro de um construtor
* */

public class Data {

    int dia;
    int mes;
    int ano;

    Data() { // construtor padrao
        //this.dia = 1;
        //this.mes = 1;
        //this.ano = 1970;
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return dia + "/" + mes + "/" + ano;
    }

    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }
}
