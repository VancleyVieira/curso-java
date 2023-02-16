package claasse;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AreaCircTeste {

    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
//          a1.pi = 9999999;
            a1.raio = 10;

//      AreaCirc.pi = 3.1415; // se for preciso mudar o valor de um atributo STATICO o ideal é usando o nome da CLASSE
        // Porem se o atributo for FINAL, NÃO é possivel mudar o VALOR dele

        System.out.println("PI Acessado pela minha classe: " + AreaCirc.PI);
        System.out.println("PI Acessado pela classe Math: " + Math.PI);

        System.out.println("Calculando a area pelo metodo pertencente a INSTANCIA: " + a1.area());
        System.out.println("Calculando a area pelo metodo STATICO (pertencente a classe) sem precisar instanciar objeto para isso: " + AreaCirc.area(100));
    }
}
