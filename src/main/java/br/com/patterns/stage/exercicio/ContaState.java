package br.com.patterns.stage.exercicio;

public interface ContaState {
  void saque(double valor);
  void deposito(double valor);
  void atualizarStateConta();
}
