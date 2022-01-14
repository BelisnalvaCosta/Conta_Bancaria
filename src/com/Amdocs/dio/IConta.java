package com.Amdocs.dio;

import com.Amdocs.dio.Interface.CalcularSaldoBancario;

public interface IConta extends CalcularSaldoBancario {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();

}
