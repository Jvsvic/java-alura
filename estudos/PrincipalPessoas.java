package estudos;

import java.util.ArrayList;

public class PrincipalPessoas {
    public static void main(String[] args) {
        Pessoas pessoaUm = new Pessoas();
        pessoaUm.setNome("Mario");
        pessoaUm.setIdade(18);

        Pessoas pessoaDois = new Pessoas();
        pessoaDois.setNome("João");
        pessoaDois.setIdade(19);

        Pessoas pessoaTres = new Pessoas();
        pessoaTres.setNome("Pedro");
        pessoaTres.setIdade(21);

        Pessoas pessoaQuatro = new Pessoas();
        pessoaQuatro.setNome("Maria");
        pessoaQuatro.setIdade(22);

        Pessoas pessoaCinco = new Pessoas();
        pessoaCinco.setNome("Lucas");
        pessoaCinco.setIdade(23);

        Pessoas pessoaSeis = new Pessoas();
        pessoaSeis.setNome("Paulo");
        pessoaSeis.setIdade(24);

        ArrayList <Pessoas> listaDePessoas = new ArrayList();
        listaDePessoas.add(pessoaUm);
        listaDePessoas.add(pessoaDois);
        listaDePessoas.add(pessoaTres);
        listaDePessoas.add(pessoaQuatro);
        listaDePessoas.add(pessoaCinco);
        listaDePessoas.add(pessoaSeis);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " +listaDePessoas.get(1).getIdade());
        System.out.println("Lista completa: ");
        for (Pessoas pessoa : listaDePessoas) {
            System.out.println(pessoa.getNome() + " - " + pessoa.getIdade());

        }
        System.out.println(listaDePessoas.toString());
    }
}
