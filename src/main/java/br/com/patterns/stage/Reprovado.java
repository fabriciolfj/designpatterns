package br.com.patterns.stage;

public class Reprovado implements EstadoDeUmOrcamento {

  @Override
  public void aplicaDescontoExtra(Orcamento orcamento) {
    throw new RuntimeException("Orçamentos reprovados não recebem desconto.");
  }

  @Override
  public void aprova(Orcamento orcamento) {
    throw new RuntimeException("Estado reprovado não pode ser aprovado.");
  }

  @Override
  public void reprova(Orcamento orcamento) {
    throw new RuntimeException("Estado reprovado, não pode ser reprovado novamente.");
  }

  @Override
  public void finaliza(Orcamento orcamento) {
    orcamento.estadoAtual = new Finalizado();
  }
}
