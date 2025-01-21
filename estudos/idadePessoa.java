package estudos;

public class idadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public void verificaIdade(){
        if (idade < 18) {
            System.out.println("É menor de idade");
        } else {
            System.out.println("É maior de idade");
        }
    }
}

