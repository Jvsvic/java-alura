package estudos.desafioexception;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        String senha = scan.nextLine();
        String senhacorreta = "123";
    try{
        if (!senha.equals(senhacorreta)) {
            throw new ErroSenha("Senha incorreta!");

        }
        System.out.println("Senha correta!");
        System.out.println("Usuário logado com sucesso!");
    }
    catch(ErroSenha e){
        System.out.println(e.getMessage());
    }
    }
}
