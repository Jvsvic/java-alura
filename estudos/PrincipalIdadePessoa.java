package estudos;

public class PrincipalIdadePessoa {
    public static void main(String[] args) {
        idadePessoa novaPessoa = new idadePessoa();
        novaPessoa.setNome("João Vitor");
        novaPessoa.setIdade(24);
        System.out.println("Nome:" + novaPessoa.getNome());
        System.out.println("Idade:" + novaPessoa.getIdade());
        novaPessoa.verificaIdade();
    }
}
