package orientacaoObjetos.abstrato;

public abstract class Mamifero extends Animal {

    public abstract String mamar();

    // um metodd final nao pode ser reescrevido pelas subclasses da classe que ele se encontra
//    @Override
//    public final String mover() {
//        return "Saindo do lugar";
//    }
}
