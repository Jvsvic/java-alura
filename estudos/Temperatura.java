package estudos;

public class Temperatura {
    public static void main(String[] args) {
        double celsius = 35;
        double farfa = (celsius * 1.8) + 32;
        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", celsius, farfa);
        System.out.println(mensagem);
        int temperaturaInteira = (int) farfa;
        System.out.println("A temperatura inteira é " + temperaturaInteira);
    }

}
