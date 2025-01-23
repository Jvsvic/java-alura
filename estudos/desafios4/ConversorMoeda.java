package estudos.desafios4;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolar(double valorDolar){
        double cotacaoDolar = 6.20;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor convertido de " + valorDolar + " dólares para reais é: " + valorReal);
    }
    @Override
    public void converterEuro(double valorEuro){
        double contacaoEuro = 6.45;
        double valorReal = valorEuro * contacaoEuro;
        System.out.println("O valor convertido de " + valorEuro + "Euros para reais é: " + valorReal);
    }
}
