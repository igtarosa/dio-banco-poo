package com.dio.bancopoo;

public class Teste {

    public static void main(String[] args) {

        //Criando clientes
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();


        //Associando clientes e contas (Polimorfismo)
        Conta conta1 = new ContaPoupanca(cliente1);
        Conta conta2 = new ContaCorrente(cliente1);
        ContaCorrente cc = new ContaCorrente(cliente3);
        ContaPoupanca cp = new ContaPoupanca(cliente2);

        //Testando
       cliente3.setNomeCliente("Maria Clara");
       cc.depositar(100);
       cc.sacar(150);

        cliente2.setNomeCliente("Joao Pedro");
        cp.depositar(800);
        cp.transferir(370, conta2);

        cliente1.setNomeCliente("Ana Julia");
        conta1.depositar(100);
        conta2.sacar(50);

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(cc);
        System.out.println(cp);
    }
}
