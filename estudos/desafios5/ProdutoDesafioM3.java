package estudos.desafios5;

public class ProdutoDesafioM3 {
    private String nome;
    private double preco;

    ProdutoDesafioM3(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Produto: " + this.nome + "\nPreco: " + this.preco;
    }
}
