package estudos;

public class ContaCorrenteOverride extends ContaBancariaOverride{
    private double tarifaMensal;

    public void cobrarTarifaMensal(){
        setSaldo(getSaldo() - tarifaMensal);
        System.out.printf("Tarifa mensal de %s cobrada. Saldo atual: %s%n", tarifaMensal, getSaldo());

    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }
}
