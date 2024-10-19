package br.com.ContaBancaria.conta.contaPoupança;

import br.com.ContaBancaria.conta.gerenciadoDeConta.Conta;

public class ContaPoupanca extends Conta {

    private double taxaDeJuros;

    public void calcularjuro(){
        double juros = this.getSaldoDaConta() * taxaDeJuros;
        System.out.println("Juros Atual: " + juros);
    }
}
