package claasse;

import claasse.Data;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data(7, 8, 2001); // inicializando um novo objeto passando os valores pedidios no construtor

//      Chamando o construtor padrao
        Data data2 = new Data();
//        se eu nao passar nada, ele consederará os valores que eu coloquei como Default dentro do construtor
//        data2.dia = 14;
//        data2.mes = 7;
//        data2.ano = 2005;

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();
    }
}
