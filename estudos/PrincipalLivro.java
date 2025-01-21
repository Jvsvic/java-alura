package estudos;

public class PrincipalLivro {
    public static void main(String[] args) {
        Livro livroNovo = new Livro();
        livroNovo.setTitulo("O menino que roubava livros.");
        livroNovo.setAutor("João Vitor");
        livroNovo.exibirInformacoes();
    }
}
