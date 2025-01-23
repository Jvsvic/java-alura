package estudos.desafios4;


public class TesteConversorMoeda{
    public static void main(String[] args) {
        ConversorMoeda primeira = new ConversorMoeda();
        primeira.converterDolar(50);
        ConversorMoeda segunda = new ConversorMoeda();
        segunda.converterEuro(100);
    }
}
