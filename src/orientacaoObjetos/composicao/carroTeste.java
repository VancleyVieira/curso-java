package orientacaoObjetos.composicao;

public class carroTeste {

    public static void main(String[] args) {
        // Relacao UM para UM
        
        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        // Relação bidirecional:
        c1.motor.carro.motor.carro.motor.giros();

        // Faltou emcapsulamento!!!
        // c1.motor.fatorInjecao = -30;

        System.out.println(c1.motor.giros());
    }
}
