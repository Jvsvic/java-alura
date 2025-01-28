package estudos.desafioexception;

public class ErroSenha extends RuntimeException {
    private String mensagem;

    public ErroSenha(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
