package com.dio.bancopoo;

public interface Banco {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
}
