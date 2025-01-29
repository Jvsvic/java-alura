package estudos.desafioapi;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) {
        // Criando a URI corretamente usando o cep
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");
        // Construção da requisição HTTP com a URI correta
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)  // Passando a URI diretamente aqui
                .build();

        try {
            // Enviando a requisição e recebendo a resposta
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter respostas.");
        }

    }
}
