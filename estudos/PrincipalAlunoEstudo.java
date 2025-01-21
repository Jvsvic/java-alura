package estudos;

public class PrincipalAlunoEstudo {
    public static void main(String[] args) {
        AlunoEstudo primeiroAluno = new AlunoEstudo();
        primeiroAluno.setNome("João");
        primeiroAluno.setNota1(8.5);
        primeiroAluno.setNota2(9.5);
        primeiroAluno.setNota3(5);
        primeiroAluno.setNota4(7.5);
        System.out.println("A média do aluno é: " + primeiroAluno.calcularMedia());
    }
}
