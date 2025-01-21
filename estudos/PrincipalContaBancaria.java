package estudos;


import org.w3c.dom.ls.LSOutput;

public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroConta(1895);
        conta1.setSaldo(2000);
        conta1.titular = "Joao";

        System.out.println("O número da conta é: " + conta1.getNumeroConta());
        System.out.println("O saldo da conta é: " + conta1.getSaldo());
        System.out.println("Titular: " + conta1.titular);

        conta1.setSaldo(1500);
        System.out.println("Novo saldo: " + conta1.getSaldo());
    }
}
