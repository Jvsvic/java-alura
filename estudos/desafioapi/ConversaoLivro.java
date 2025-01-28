package estudos.desafioapi;

import com.google.gson.Gson;

public class ConversaoLivro {
    public static void main(String[] args) {


    String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";
    Gson gson = new Gson();
    Livro novoLivro = gson.fromJson(jsonLivro, Livro.class);
    System.out.println("Objeto Livro: " + novoLivro);
    System.out.println("Objeto pessoa: " + novoLivro);
}
}
