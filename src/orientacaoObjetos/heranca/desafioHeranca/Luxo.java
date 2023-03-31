package orientacaoObjetos.heranca.desafioHeranca;

public interface Luxo {

    // todos os metodos de uma interface são publicos e abstratos
    // quando uma classe implementa uma interface ela é obrigada a reescrever os metodos da interface
    // Uma classe pode extender apenas um classe porém pode implementar varias interfaces

    public abstract void ligarAr(); // redundante
    void desligarAr();

    // implementacao padrao nas interfaces podemos criar um metodo default
    // Dessa forma as classes que extenderem a interface nao necessariamente sao obrigadas a implementarem o metodo
    default int velocidadeDoAr() {
        return 1;
    }
}
