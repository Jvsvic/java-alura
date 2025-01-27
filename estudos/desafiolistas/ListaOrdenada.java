package estudos.desafiolistas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(45);
        lista.add(58);
        lista.add(73);
        lista.add(22);
        lista.add(89);
        lista.add(34);
        lista.add(11);
        System.out.println("Lista sem ordenar: " + lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
    }
}
