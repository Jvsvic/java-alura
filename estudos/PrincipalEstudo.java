package estudos;

public class PrincipalEstudo {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.dobro(5);
        System.out.println(resultado);

        Musica musicaNova = new Musica();
        musicaNova.titulo = "Nova música";



    }
}
