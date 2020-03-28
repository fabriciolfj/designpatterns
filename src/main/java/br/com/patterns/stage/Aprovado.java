package br.com.patterns.stage;

public class Aprovado implements EstadoDeUmOrcamento {

  private boolean descontoAplicado = false;

  @Override
  public void aplicaDescontoExtra(Orcamento orcamento) {
    if(!descontoAplicado) {
      orcamento.valor -= orcamento.valor * 0.02;
      this.descontoAplicado = true;
      return;
    }

    throw new RuntimeException("Desconto já aplicado no momento da aprovação.");
  }

  @Override
  public void aprova(Orcamento orcamento) {
    throw new RuntimeException("Orçamento aprovado, não pode ser aprovado novamente.");
  }

  @Override
  public void reprova(Orcamento orcamento) {
    throw new RuntimeException("Orçamento aprovado, não pode ser reprovado.");
  }

  @Override
  public void finaliza(Orcamento orcamento) {
    orcamento.estadoAtual = new Finalizado();
  }
}
