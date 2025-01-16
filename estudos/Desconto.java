package estudos;

public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 23.50; // Valor original
        double percentualDesconto = 0.10; // Representa 10% desconto
        double calculaDesconto = precoOriginal * percentualDesconto;
        double precoFinal = precoOriginal - calculaDesconto;
        System.out.println("Preço original: " + precoOriginal);
        System.out.println("Valor da desconto: " + percentualDesconto * 100 + "%");
        System.out.println("Valor da desconto: " + calculaDesconto);
        System.out.println("Preço final:" + precoFinal);

    }
}

