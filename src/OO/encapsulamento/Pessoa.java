package OO.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }
    public int getIdade(){
        return  idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 130) this.idade = novaIdade;
    }

}
