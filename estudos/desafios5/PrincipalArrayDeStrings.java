package estudos.desafios5;

import java.util.ArrayList;

public class PrincipalArrayDeStrings {
    public static void main(String[] args) {


        ArrayList<ArrayDeStrings> lista = new ArrayList<>();
        lista.add(new ArrayDeStrings("João", "Descrição do João", "Analista"));
        lista.add(new ArrayDeStrings("Maria", "Descrição da Maria", "Gerente"));
        lista.add(new ArrayDeStrings("Carlos", "Descrição do Carlos", "Desenvolvedor"));

        for (ArrayDeStrings elemento : lista) {
            System.out.println(elemento);
            
        }
    }
}
