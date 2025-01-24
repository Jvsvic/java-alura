package estudos.desafios5;

import java.util.ArrayList;

public class PrincipalProdutoDesafioM3 {
    public static void main(String[] args) {
        ProdutoDesafioM3 prod1 = new ProdutoDesafioM3("Telefone", 1500);
        ProdutoDesafioM3 prod2 = new ProdutoDesafioM3("Monitor", 2300);
        ProdutoDesafioM3 prod3 = new ProdutoDesafioM3("Teclado", 100);
        ProdutoDesafioM3 prod4 = new ProdutoDesafioM3("Mesa", 500);

        ArrayList<ProdutoDesafioM3> lista = new ArrayList<>();
        lista.add(prod1);
        lista.add(prod2);
        lista.add(prod3);
        lista.add(prod4);

        double somaPrecos = 0;
        for (ProdutoDesafioM3 p : lista) {
            somaPrecos += p.getPreco();
            System.out.println("Preço total da produto: " + p.getPreco());
        }
        double precoMedio = somaPrecos / lista.size();
        System.out.println("Preço medio: " + precoMedio);

    }
}
