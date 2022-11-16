package fundamentos;

public class ConversaoNumeroString {

    public static void main(String[] args) {
        // Utilizando Wrapper:
        Integer numero1 = 10000;
        System.out.println(numero1.toString()); // imprime 10000 porem em formato de String
        System.out.println(numero1.toString().length()); // Para vermos melhor que realmente foi convertido utilizei o metodo length()
                                                        // presente na classe String para retornar quandos characteres existem na String,
                                                        // neste caso quandos digitos tem o numero.

        // convertendo a partir do tipo primitivo agora:
        int numero2 = 100000;
        System.out.println(Integer.toString(numero2));
        System.out.println(Integer.toString(numero2).length());

        // Ou quando concatenamos uma string vazia a um tipo numerico o efeito de conversão é o mesmo
        System.out.println(("" + numero1).length()); // Retorna a quantidade de characteres do numero 1
        System.out.println(("" + numero2).length()); // Retorna a quantidade de characteres do numero 2

    }
}
