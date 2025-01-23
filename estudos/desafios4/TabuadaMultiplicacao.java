package estudos.desafios4;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada: " + numero);
        for (int i = 1; i <= numero; i++ ) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + " = " + resultado);

        }
    }
}
