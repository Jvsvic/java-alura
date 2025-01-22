package estudos;

import java.util.Scanner;

public class ContaBancariaOverride {
    private double depositar;
    private double sacar;
    private double saldo = 0;
    Scanner scanner = new Scanner(System.in);

    public double ConsultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
        return saldo;
    }

    public double sacarSaldo(double valorSaque) {
        if (valorSaque <= saldo) {
            saldo -= valorSaque; // Subtrai o número digitado
            System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para sacar.");
        }
        return saldo;
    }

    public double depositarSaldo(double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.println("Depósito realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Valor para depósito inválido.");
        }
        return saldo;
    }

    // Getters e Setters
    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }
}
