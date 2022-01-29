package com.dio.bancopoo;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente nomeCliente) {
        super(nomeCliente);
    }

    @Override
    public String toString() {
        System.out.println("======= Extrato Conta =======");
        return "Tipo: Conta Corrente," +
                " Numero da Conta: " + numConta +
                ", Titular: " + nomeCliente +
                ", Saldo: R$ " + saldo +
                ']';
    }
}
