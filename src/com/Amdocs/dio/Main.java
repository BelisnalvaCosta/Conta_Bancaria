package com.Amdocs.dio;

public class Main {

    public static void main(String[] args) {

        Cliente Hilda = new Cliente();
        Hilda.setNome("Hilda Silva");

        Conta cc = new ContaCorrente(Hilda);
        Conta poupanca = new ContaPoupanca(Hilda);

        cc.depositar(1500.00);
        cc.transferir(600.00, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
