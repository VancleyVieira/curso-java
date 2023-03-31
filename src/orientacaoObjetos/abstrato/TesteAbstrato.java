package orientacaoObjetos.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {

        Mamifero animal1 = new Cachorro();
        System.out.println(animal1.mover());
        System.out.println(animal1.mamar());
        System.out.println(animal1.respirar());
    }
}
