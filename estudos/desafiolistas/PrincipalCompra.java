package estudos.desafiolistas;

import java.util.Scanner;

public class PrincipalCompra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        int limite = entrada.nextInt();
        entrada.nextLine(); // Limpa o buffer do Scanner após o nextInt()

        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite o nome do produto: ");
            String descricao = entrada.nextLine();

            System.out.println("Digite o valor da compra: ");
            double valor = entrada.nextDouble();
            entrada.nextLine(); // Limpa o buffer do Scanner após o nextDouble()

            Compra compra = new Compra(descricao, valor);
            boolean addCompra = cartao.addCompra(compra);

            if (addCompra) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = entrada.nextInt();
                entrada.nextLine(); // Limpa o buffer do Scanner após o nextInt()
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }

            System.out.println("***********************");
            System.out.println("COMPRAS REALIZADAS:\n");

            for (Compra c : cartao.getCompras()) {
                System.out.println(c.getDescricao() + " - " + c.getValor());
            }
            System.out.println("\n***********************");

            System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
        }

        entrada.close(); // Fecha o Scanner ao final do programa
    }
}
