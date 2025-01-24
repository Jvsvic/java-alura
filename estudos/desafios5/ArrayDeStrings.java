package estudos.desafios5;

import java.util.ArrayList;

public class ArrayDeStrings {
    private String nome;
    private String descricao;
    private String cargo;

    public ArrayDeStrings(String nome, String descricao, String cargo) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargo = cargo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", descrição: " + this.descricao + ", cargo: " + this.cargo;
    }
}
