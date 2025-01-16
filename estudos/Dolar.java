package estudos;

public class Dolar {
    public static void main(String[] args) {
        double valorEmDolares = 52.50;
        double taxa = 4.94;
        double reais = valorEmDolares * taxa;
        String mensagem = String.format("O valor de %.2f em dolares convertido em real é %.2f", valorEmDolares, reais);
        System.out.println(mensagem);
    }
}
