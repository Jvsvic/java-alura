package estudos;

public class Livro {
    private String titulo;
    private String autor;

    public void exibirInformacoes (){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
