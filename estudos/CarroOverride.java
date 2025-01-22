package estudos;

import java.text.DecimalFormat;

public class CarroOverride {
    private String nome;
    private double valor1;
    private double valor2;
    private double valor3;

    public void exibirInfo(){
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Modelo: " + this.nome);
        System.out.println("Valor do ano 1: " + this.valor1);
        System.out.println("Valor do ano 2: " + this.valor2);
        System.out.println("Valor do ano 3: " + this.valor3);
        System.out.println("O menor valor é: " + df.format(calcularMenorValor()));
        System.out.println("O maior valor é: " + df.format(maiorValor()));

    }
    public double calcularMenorValor(){
        double calcularMenorValor = valor1;
        if (valor2 < calcularMenorValor) {
            calcularMenorValor = valor2;
        }
        if (valor3 < calcularMenorValor) {
            calcularMenorValor = valor3;
        }
        return calcularMenorValor;

    }
    public double maiorValor(){
        double maiorValor = valor1;
        if (valor2 > maiorValor) {
            maiorValor = valor2;
        }
        if (valor3 > maiorValor) {
            maiorValor = valor3;
        }
        return maiorValor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor3() {
        return valor3;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }
}



