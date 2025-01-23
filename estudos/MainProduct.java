package estudos;

import java.util.ArrayList;

public class MainProduct {
    public static void main(String[] args) {
        Product newProduct = new Product("Mogami", 1500, 23);
//        newProduct.setName("Mogami");
//        newProduct.setPrice(1500);
//        newProduct.setQuantity(23);

        Product newProduct2 = new Product("Saude Brasil", 2300, 98);
//        newProduct2.setName("Saude Brasil");
//        newProduct2.setPrice(2300);
//        newProduct2.setQuantity(98);

        Product newProduct3 = new Product("Hospital das Clinicas", 58000, 15);
//        newProduct3.setName("Hospital das Clinicas");
//        newProduct3.setPrice(58000);
//        newProduct3.setQuantity(15);

        ArrayList<Product> list = new ArrayList<>();
        list.add(newProduct);
        list.add(newProduct2);
        list.add(newProduct3);
        System.out.println("O tamanho da lista: " + list.size());
        System.out.println(list.toString());

        //Agora Trabalhando com a classe ProductPerishable
        ProductPerishable product1 = new ProductPerishable("Caderno", 10, 20, "19/01/2025");
        ProductPerishable product2 = new ProductPerishable("Lápis", 199, 50, "20/01/2025");
        ProductPerishable product3 = new ProductPerishable("Borracha", 50, 50, "23/01/2025");


        ArrayList<ProductPerishable> listaPerishable = new ArrayList<>();
        listaPerishable.add(product1);
        listaPerishable.add(product2);
        listaPerishable.add(product3);
        System.out.println("O tamanho da lista: " + listaPerishable.size());
        System.out.println(listaPerishable.toString());
    }
}
