package estudos;

import java.util.Scanner;

public class Comparando {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite dois números inteiros: ");
        int num1 = numeros.nextInt();
        int num2 = numeros.nextInt();

        if (num1 > num2) {
            System.out.printf("O número %d é maior que o %d", num1, num2);
        } else if (num1 < num2) {
            System.out.printf("O número %d é menor que o %d", num1, num2);
        } else {
            System.out.print("Os números são iguais");
        }
    }
}
