package estudos.desafios4;

import estudos.Calculadora;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("Area de retangular é: " + area);
    }
    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("Perimetro de retangular é: " + perimetro);
    }
}