package estudos;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    int avaliacao;
    double numAvaliacoes;

    void exibeDados(){
        System.out.println("Nome da música: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    void avalia(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }
    double mediaTotal(){
        return avaliacao / numAvaliacoes;
    }

}
