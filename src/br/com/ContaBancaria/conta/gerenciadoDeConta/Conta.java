package br.com.ContaBancaria.conta.gerenciadoDeConta;

public class Conta {

    private String usuario;
    private double saldoDaConta = Integer.MIN_VALUE;
    private double deposito;
    private double transferencia;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
        this.saldoDaConta = deposito;
    }

    public double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(double transferencia) {
        this.transferencia = transferencia;
        this.saldoDaConta -= transferencia;
    }
}
