package orientacaoObjetos.emcapsulamento;

public class Pessoa {

    private int idade;
    private String nome;
    private String sobreNome;

    public Pessoa(int idade, String nome, String sobreNome) {
        setNome(nome);
        setIdade(idade);
        setSobreNome(sobreNome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        idade = Math.abs(idade); // Math.abs transforma um numero em um valor absoluto
        if(idade >= 0 && idade <= 120) {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getNomeCompleto() {
        return getNome() + getSobreNome();
    }

    public String toString() {
        return "Ola eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
    }
}
