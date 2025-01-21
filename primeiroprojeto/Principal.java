package primeiroprojeto;

import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaDasAvaliacoes());
        //System.out.println(meuFilme.totalDeAvaliacoes);
        //System.out.println(meuFilme.mediaDasAvaliacoes());
        //meuFilme.somaDasAvaliacoes = 10;
        //System.out.println(meuFilme.somaDasAvaliacoes);
    }
}
