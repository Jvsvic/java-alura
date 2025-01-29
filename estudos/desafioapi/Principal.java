package estudos.desafioapi;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();

        System.out.println("Digite o CEP: ");
        var cep = in.nextLine();
        try {
            Endereco novoEndereco = consulta.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.geraArquivo(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
