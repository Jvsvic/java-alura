package estudos;

public class PrincipalMusica {
    public static void main(String[] args) {
        Musica m = new Musica();
        m.titulo = "Nova música";
        m.anoDeLancamento = 2016;
        m.artista = "ColdPlay";

        m.exibeDados();

        m.avalia(5);
        m.avalia(10);
        m.avalia(7);
        System.out.println(m.mediaTotal());
        System.out.println(m.numAvaliacoes);
    }
}
