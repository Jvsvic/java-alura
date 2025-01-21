package estudos;

public class Carro {
    String modelo;
    String cor;
    int ano;

    // Método para exibir informações do carro
    void inicial(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    // Método para calcular a idade do carro
    int calcularAno(){
        return 2025 - ano;  // Retorna a idade do carro
    }
}
