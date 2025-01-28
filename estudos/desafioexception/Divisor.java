package estudos.desafioexception;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        try {

            Scanner divisores = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            int num1 = divisores.nextInt();
            System.out.println("Digite outro número: ");
            int num2 = divisores.nextInt();
            int resultado = (num1 + num2) / 2;
            System.out.println("Resultado: " + resultado);
            divisores.close();
        } catch (ArithmeticException e) {
            System.out.println("Não é possivel dividir por 0");
        }
    }
}




