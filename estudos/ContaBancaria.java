package estudos;


//Classe ContaBancaria
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() { /// GET NUMERO CONTA
        return numeroConta;
    }

    public double getSaldo() {  /// GET SALDO
        return saldo;
    }


    public void setNumeroConta(int numeroConta) { /// SET NUMEROCONTA
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) { /// SET SALDO
        this.saldo = saldo;
    }
}


