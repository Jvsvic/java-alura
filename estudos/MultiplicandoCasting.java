package estudos;

public class MultiplicandoCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = 8.5;
        double total = a * b;
        String resultado = String.format("%.2f", total);
        String mensagem = "O valor total da compra é " + total;
        System.out.println(mensagem);
        System.out.println(resultado);
    }
}
