package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

    public static void main(String[] args) {
        // Armazenando uma String a partir do JOptionPane.showInputDiolag();
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

        // Como são duas Strings quando tentamos somar, ao inves da soma ser feita os valores são concatenados
        System.out.println(valor1 + valor2); // valores concatenados

        // Convertendo com parceDouble()
        double numero1 = Double.parseDouble(valor1); // passando que valor1 agora é um double dentro de numero1
        double numero2 = Double.parseDouble(valor2); // passando que valor2 agora é um double dentro de numero2

        // Agora conseguimos somar os valores sem prolemas

        double soma = numero1 + numero2; // Lembrando de utilizar numero1 e numero2, não valor1 e valor2
        System.out.println("A soma: " + soma);
        System.out.println("A media: " + soma / 2);

    }
}
