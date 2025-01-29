package estudos.desafioexception;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class Github {
    public static void main(String[] args) {
        Scanner lerusuario = new Scanner(System.in);
        System.out.println("Digite um usuario: ");
        var busca = lerusuario.nextLine();
        String endereco = "https://api.github.com/users/" + busca;
        System.out.println(endereco);
        try{

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Esse usuário não foi encontrado na base de dados");
            }
        }
        catch (ErroConsultaGitHubException | IOException | InterruptedException  e){
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println("Parece que você usou um caracter ilegal");
        }
    }

}
