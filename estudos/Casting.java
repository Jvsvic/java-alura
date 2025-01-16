package estudos;

public class Casting {
    public static void main (String[] args) {
        double x = 5.6;
        int y = (int) x;
        System.out.println(y);

        double idade = 75.0;
        int anos = (int) idade;
        System.out.println("2 - " + anos); // Validação
    }
}
