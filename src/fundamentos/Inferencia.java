package fundamentos;

public class Inferencia {
    //Testando como JAVA trata as inferencias
    public static void main(String[] args) {

        var a = 10.5; //Criando e incerindo valor a uma variavel
        System.out.println(a); //Retornando o valor de a

        a = 11.1; //Esta linha compina pois JAVA entende que esta atribuição a variavel a é igual a primeira atribuida
        System.out.println(a); //Podemos ver que tudo compila perfeitamente

        // Esta linha não compila pois JAVA reconheceu a como tipo double e em java não podemos mudar o tipo de uma variavel
        // a = "Incerindo um texto a variavel a";

        // O mesmo acontece quando uma variavel nasce String e tentamos atrbuila como um double ou int

        var b = "Teste de inferencias.";
        System.out.println(b);

        //b = 10; NÃO COMPILA

        // Uma variavel em JAVA nasce de um tipo e morre com mesmo tipo que nasceu pois é uma linguagem fortemente tipada
    }

}
