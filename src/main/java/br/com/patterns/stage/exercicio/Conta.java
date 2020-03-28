package br.com.patterns.stage.exercicio;

public class Conta {

  protected double saldo;
  protected ContaState state;

  public Conta(double saldo) {
    this.saldo = saldo;
    this.state = new ContaPositiva(this);
  }

  public void saque(double valor) {
    state.saque(valor);
  }

  public void deposito(double valor) {
    state.deposito(valor);
  }

}
