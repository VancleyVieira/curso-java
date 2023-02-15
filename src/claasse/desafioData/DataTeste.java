package claasse.desafioData;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data();

        data1.dia = 7;
        data1.mes = 8;
        data1.ano = 2001;

        Data data2 = new Data();

        data2.dia = 14;
        data2.mes = 7;
        data2.ano = 2005;

        System.out.println(data1.dia+"/"+data1.mes+"/"+data1.ano);
        System.out.println(data2.dia+"/"+data2.mes+"/"+data2.ano);
    }
}
