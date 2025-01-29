package estudos.desafioapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cep {

    private static String consultaCep(String endereco) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(endereco))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        //PARA ENTRADA DE DADOS
        Scanner scanner = new Scanner(System.in);
        //PARA COMEÇAR A STRING COM NADA
        String buscador = "";
        //PARA CRIAR A LISTA
        List<String> ceps = new ArrayList<>();
        //PARA SALVAR COMO JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("Digite exit para finalizar a consulta.");


        while (!buscador.equalsIgnoreCase("exit")) {
            System.out.println("Digite um CEP para consultar sua API: ");
            buscador = scanner.nextLine();

            // Verifica se o usuário digitou 'exit'
            if (buscador.equalsIgnoreCase("exit")) {
                System.out.println("Finalizando processo...");
                break;
            }

            String endereco = "https://viacep.com.br/ws/" + buscador + "/json/";
            System.out.println("Consultando o endereço: " + endereco);
            try {
                // Consulta o CEP e adiciona a resposta à lista
                String resposta = consultaCep(endereco);
                System.out.println("Resposta da API: " + resposta);
                ceps.add(resposta);
            } catch (IllegalArgumentException | URISyntaxException | IOException | InterruptedException e) {
                ;
                System.out.println("Erro ao enviar o CEP" + e.getMessage());
            }
        }
        // Salva as respostas no arquivo JSON após o loop
        System.out.println(ceps);
        FileWriter escrita = new FileWriter(("ceps-lista.json"));
        escrita.write(gson.toJson(ceps));
        escrita.close();
        System.out.println("O programa finalizou corretamente.");
    }

}
