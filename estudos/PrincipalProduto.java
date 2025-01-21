package estudos;

public class PrincipalProduto {
    public static void main(String[] args) {
        Produto produtoNovo = new Produto();
        produtoNovo.setNome("Produto Novo");
        produtoNovo.setPreco(1500);
        System.out.println("Nome do produto: " + produtoNovo.getNome());
        System.out.println("Produto antes do desconto: " + produtoNovo.getPreco());
        produtoNovo.aplicarDesconto();
        System.out.println("Produto depois do desconto: " + produtoNovo.getPreco());
    }
}
