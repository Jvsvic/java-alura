package estudos.desafioexception;

public class ErroConsultaGitHubException extends RuntimeException {
  String mensagemErro;

    public ErroConsultaGitHubException(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }
    @Override
  public String getMessage() {
      return this.mensagemErro;
    }
}
