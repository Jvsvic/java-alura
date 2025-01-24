package estudos.desafios5;

import java.util.ArrayList;

public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1565, 1500);
        ContaBancaria conta2 = new ContaBancaria(9591, 98);
        ContaBancaria conta3 = new ContaBancaria(0022, 9840);
        ContaBancaria conta4 = new ContaBancaria(1195, 7400);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);
        ContaBancaria contaSaldoMaior = listaDeContas.get(0);


        for (ContaBancaria v : listaDeContas) {
            if (v.getSaldo() > contaSaldoMaior.getSaldo()){
                contaSaldoMaior = v;
                System.out.println("Conta com o maior saldo: " + v.getSaldo() );
            }
        }

    }
}
