    package br.com.alura.screenmatch.principal;

    import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
    import br.com.alura.screenmatch.modelos.Titulo;
    import br.com.alura.screenmatch.modelos.TituloOmdb;
    import com.google.gson.FieldNamingPolicy;
    import com.google.gson.Gson;
    import com.google.gson.GsonBuilder;

    import java.io.IOException;
    import java.net.URI;
    import java.net.http.HttpClient;
    import java.net.http.HttpRequest;
    import java.net.http.HttpResponse;
    import java.util.Scanner;

    public class PrincipalComBusca {
        public static void main(String[] args) throws IOException, InterruptedException {

            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite um filme para busca: ");
            var busca = leitura.nextLine().replace(" ", "+");
            String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=6585022c";
            System.out.println(endereco);
    try{
            HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println(response.body());
            String json = response.body();
            System.out.println(json);
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            //try{
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println(meuTitulo);
                System.out.println("Título já convertido.");}

    catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
    }
    catch (IllegalArgumentException e) {
        System.out.println("Algum erro de argumento na busca, verifique o endereço");
    }
    catch (ErroDeConversaoDeAnoException e){
        System.out.println(e.getMessage());
    }
            System.out.println("O programa finalizou corretamente.");
        }
    }
