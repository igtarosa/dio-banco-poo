package com.dio.bancopoo;

public abstract class Conta implements Banco {

    private static int SEQUENCIAL = 1;

    protected Cliente nomeCliente;
    protected int numConta;
    protected double saldo;

    public Conta() {
    }

    public Conta(Cliente nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.numConta = SEQUENCIAL++;
        this.saldo = getSaldo();
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {

        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso, novo saldo = " + getSaldo());
            System.out.println("----------");
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + getSaldo());
            System.out.println("----------");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
