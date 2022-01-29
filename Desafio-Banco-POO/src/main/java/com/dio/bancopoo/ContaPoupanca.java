package com.dio.bancopoo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente nomeCliente){
        super(nomeCliente);
    }

    @Override
    public String toString() {
        System.out.println("======= Extrato Conta =======");
        return "Tipo: Conta Poupanca," +
                " Numero da Conta: " + numConta +
                ", Titular: " + nomeCliente +
                ", Saldo: R$ " + saldo +
                ']';
    }
}