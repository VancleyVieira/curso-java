package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        double a = 1; // o compilador faz a conversão de forma  implicita.
        System.out.println(a); // Imprime: 1.0.

        float b = (float) 1.123456788888; // Conversão feita de forma explicita usando (CAST).
        System.out.println(b); // 1.1234568 veja que houve perda de valor na converção.

        int c = 340;
        byte d = (byte) c; // passando um int dentro de um byte (CAST)
        System.out.println(d); // imprime 84 pq byte suporte de -127 ate 128, 240 não esta no seu range, quando ele
                                // excede o renge ele volta ao ponto incial e continua contando.

        double e = 1.9999999;
        int f = (int) e; // Conversão feita de forma explicita usando (CAST).
        System.out.println(f); // Imprime '1' Veja o gravidade da perda de valores em contextos expecificos.

        // Tomar muito cuidado com conversões com CAST, muitas vezes devemos fugir desse tipo de conversão pela sua
        // complexdade e utilizar proferencialmente int e double.
    }
}
