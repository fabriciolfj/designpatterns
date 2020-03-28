package br.com.patterns.stage.exercicio;

public class ContaNegativa implements ContaState {

  private Conta conta;

  public ContaNegativa(Conta conta){
    this.conta = conta;
  }

  @Override
  public void saque(double valor) {
    throw new RuntimeException("Conta negativa não é permitido saques.");
  }

  @Override
  public void deposito(double valor) {
    this.conta.saldo += valor * 0.95;
    atualizarStateConta();
  }

  @Override
  public void atualizarStateConta() {
    if(conta.saldo >= 0){
      conta.state = new ContaPositiva(conta);
      return;
    }

    conta.state = new ContaNegativa(conta);
  }
}
