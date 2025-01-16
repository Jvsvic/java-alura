package primeiroprojeto;

public class Main {
    public static void main(String[] args) {
        System.out.print("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        //Media calculada pelas 3 notas da Jack, Paulo e Suellen
        double media = (9.8 + 6.3 + 8) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Maverick
                Muito bom!
                Filme de aventura.
                Ano de lançamento: 
                """
                + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

        double x = 10.5;
        int y = (int) x;
        System.out.println(y); // casting implicito
    }

}
