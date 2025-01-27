package estudos.desafiolistas;

import br.com.alura.screenmatch.modelos.Titulo;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Title implements Comparable<Title> {
    private String nome;

    public Title(String nome) {
        this.nome = nome;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    @Override
    public int compareTo(@NotNull Title titleNew){
        return this.getNome().compareTo(titleNew.getNome());
    }

    public static void main(String[] args) {
        List<Title> titles = new ArrayList();
        titles.add(new Title("Java"));
        titles.add(new Title("Python"));
        titles.add(new Title("Z"));
        titles.add(new Title("D"));
        titles.add(new Title("W"));
        titles.add(new Title("E"));
        titles.add(new Title("F"));
        titles.add(new Title("Z"));
        titles.add(new Title("A"));
        titles.add(new Title("J"));

        System.out.println("Antes:" + titles);

        Collections.sort(titles);

        System.out.println("Depois: " + titles);
    }
}
