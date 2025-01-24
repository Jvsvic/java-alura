package estudos.desafios5;

import java.util.ArrayList;

public class MainForma {
    public static void main(String[] args) {
        Circulo novoCirculo = new Circulo();
        novoCirculo.setRaio(5);

        Quadrado novoQuadrado = new Quadrado();
        novoQuadrado.setLado(4);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(novoCirculo);
        listaFormas.add(novoQuadrado);
        for (Forma forma : listaFormas) {
            System.out.println("Area: " + forma.calcularArea());

        }
    }
}
