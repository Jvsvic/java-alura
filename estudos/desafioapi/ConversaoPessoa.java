package estudos.desafioapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoPessoa {
    public static void main(String[] args) {
        String json = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoa novaPessoa = gson.fromJson(json, Pessoa.class);
        System.out.println("Objeto pessoa: " + novaPessoa);
        Gson gson2 = new GsonBuilder().setLenient().create();
        Pessoa novaPessoa2 = gson2.fromJson(json, Pessoa.class);
        System.out.println("Objeto pessoa: " + novaPessoa2);

    }
}

