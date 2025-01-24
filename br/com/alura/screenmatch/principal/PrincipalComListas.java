package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        filmeDoPaulo.avalia(8);
        meuFilme.avalia(7);
        outroFilme.avalia(5);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);



        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme) {
                System.out.println("Classificação do filme: " + filme.getClassificacao());
            }


        }

    }
}
