package estudos;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = numero.nextInt();
        if (numero1 % 2 == 0) {
            System.out.println("O número " + numero1 + " é par.");
        } else {
            System.out.println("O número " + numero1 + " é impar.");
        }
    }
}
