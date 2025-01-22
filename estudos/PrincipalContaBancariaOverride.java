package estudos;

public class PrincipalContaBancariaOverride {
    public static void main(String[] args) {
        ContaCorrenteOverride contaBancaria = new ContaCorrenteOverride();
        contaBancaria.setSaldo(1500);
        System.out.println("Saldo inicial: " + contaBancaria.ConsultarSaldo());


        // Realizando um saque de R$ 50
        contaBancaria.sacarSaldo(50);

        // Realizando um depósito de R$ 800
        contaBancaria.depositarSaldo(800);

        // Consultando o saldo final
        contaBancaria.ConsultarSaldo();

        //Cobrando tarifa
        contaBancaria.setTarifaMensal(250.00);
        contaBancaria.cobrarTarifaMensal();

    }
}
