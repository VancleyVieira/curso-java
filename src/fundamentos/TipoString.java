package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        //Algumas funcionalidades do tipo String em JAVA

        String s = "Boa noite";
        System.out.println(s.concat("!!")); // metodo concat() concatena uma String em outa String
        System.out.println(s + "!!"); // Concatenando com "+" tem o mesmo efeito de usar o metodo concat()
        System.out.println(s.startsWith("Boa")); // startWith() checa se a String começa com Boa ou não e retorna um boolean
        System.out.println(s.toLowerCase().startsWith("boa")); // toLowerCase() deixa o conteudo da String minusculo
        System.out.println(s.toUpperCase().endsWith("TARDE")); // toUpperCase() deixa o conteudo da SDtring maiuculo e endWith checa se a String termina com TARDE e retorna um bolean
        System.out.println(s.length()); // Retorna o tamanho da String em int
        System.out.println(s.toLowerCase().equals("boa tarde")); // equals() checa se a String passada no parametro é identica a String a ser comparada
        System.out.println(s.equalsIgnoreCase("boa tarde")); // equalsIgnoreCase() checa se a String passada no parametro é identica a String a ser comparada ignorando MAIUSCULO e minusculo

        // Existem muitos outros metodos uteis para trabalhar com String !!

        var nome = "Vancley";
        var sobrenome = "Vieira";
        var idade = 21;
        var salario = 3000.00;

        System.out.println("Nome: " + nome +
                            "Sobrenome: " + sobrenome +
                            "Idade: " + idade +
                            "Salario: " + salario + "\n");

        // Ou podemos usar o "printf" PARECIDO COM C
        System.out.printf("O senhor %s %s tem %s anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
    }
}
