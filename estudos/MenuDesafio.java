package estudos;

import java.util.Scanner;

public class MenuDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        int conta = 1000;
        String nome = "João Vitor";
        String tipoConta = "Corrente";

        System.out.println("**********************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo do cliente: " + conta);
        System.out.println("**********************");

        while (escolha != 4) {
            System.out.println("Menu desafio");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("O valor da sua conta é de: " + conta);

            } else if (escolha == 2) {
                System.out.println("Qual o valor que você recebeu?");
                int valor = scanner.nextInt();
                conta += valor;  // Atualiza o saldo corretamente
                System.out.println("O saldo atualizado é: " + conta);

            } else if (escolha == 3) {
                System.out.println("Qual o valor que você deseja enviar?");
                int pix = scanner.nextInt();

                // Verifica se há saldo suficiente para a transferência
                if (pix <= conta) {
                    conta -= pix;  // Subtrai o valor transferido
                    System.out.println("Valor enviado, saldo atual: " + conta);
                } else {
                    System.out.println("Saldo insuficiente para transferir.");
                }

            } else if (escolha == 4) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
