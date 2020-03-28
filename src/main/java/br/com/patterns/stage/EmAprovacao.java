package br.com.patterns.stage;

public class EmAprovacao implements EstadoDeUmOrcamento {

  private boolean descontoAplicado = false;

  @Override
  public void aplicaDescontoExtra(Orcamento orcamento) {
    if(!descontoAplicado) {
      orcamento.valor -= orcamento.valor * 0.05;
      descontoAplicado = true;
      return;
    }

    throw new RuntimeException("Desconto já aplicado em aprovação.");
  }

  @Override
  public void aprova(Orcamento orcamento) {
    orcamento.estadoAtual = new Aprovado();
  }

  @Override
  public void reprova(Orcamento orcamento) {
    orcamento.estadoAtual = new Reprovado();
  }

  @Override
  public void finaliza(Orcamento orcamento) {
    throw new RuntimeException("Estado em aprovação não pode ser finalizado.");
  }
}
