package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio extends Titulo implements Classificavel {
    private int numero;
    private String titulo;
    private Serie serie;
    private int totalVisualizacao;

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacao > 100) {
            return 4;
        }else {
            return 2;
        }

    }
}
