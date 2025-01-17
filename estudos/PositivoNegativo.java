package estudos;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        if (numero < 0) {
            System.out.println("O número é negativo!");
        } else if (numero > 0) {
            System.out.println("O número é positivo!");
        } else {
            System.out.println("O número é 0");
        }


        entrada.close();
    }
}