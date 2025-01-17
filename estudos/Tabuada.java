package estudos;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int tabuada = numero.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(tabuada + " x " + i + " = " + tabuada * i );
        }
    }
}
