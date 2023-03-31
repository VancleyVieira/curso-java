package orientacaoObjetos.abstrato;

public abstract class Animal {

    public String respirar() {
        return "Usando Oxigenio";
    }

    // metodos abstratos só são possiveis dentro de classes abstratas
    public abstract String mover();

}
