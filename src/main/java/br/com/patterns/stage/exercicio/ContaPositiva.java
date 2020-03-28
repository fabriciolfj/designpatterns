package br.com.patterns.stage.exercicio;

public class ContaPositiva implements ContaState {

  private Conta conta;

  public ContaPositiva(Conta conta){
    this.conta = conta;
  }

  @Override
  public void saque(double valor) {
    this.conta.saldo -= valor;
    atualizarStateConta();
  }

  @Override
  public void deposito(double valor) {
    this.conta.saldo += (valor * 0.98);
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
