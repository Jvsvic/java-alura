package estudos;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner fatorial = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int f = 1;
        int number = fatorial.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(f + "x" + i +  "= " + f );
            f *= i;
        }
        System.out.println("The fatorial of " + number + " is " + f);
    }
}
