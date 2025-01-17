package estudos;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);  // Receber dados do usuário
        int sorteador = new Random().nextInt(100) + 1;  // Gerar número aleatório entre 1 e 100
        int contagem = 0;  // Contador de tentativas
        int numeroDigitado = 0; // Guarda o número que a pessoa digitou

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Você tem 5 tentativas para adivinhar o número entre 1 e 100.");

        while (contagem < 5) {
            System.out.print("Digite um número: ");
            numeroDigitado = dados.nextInt();
            contagem++;

            if (numeroDigitado == sorteador) {
                System.out.println("Parabéns! Você acertou o número em " + contagem + " tentativa(s)!");
                break;
            } else if (numeroDigitado > sorteador) {
                System.out.println("O número sorteado é menor que " + numeroDigitado + ". Tente novamente!");
            } else {
                System.out.println("O número sorteado é maior que " + numeroDigitado + ". Tente novamente!");
            }
        }

        if (numeroDigitado != sorteador) {
            System.out.println("Você usou todas as tentativas. O número era: " + sorteador);
        }

        dados.close();  // Fecha o scanner
    }
}
