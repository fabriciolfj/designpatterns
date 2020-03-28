package br.com.patterns.operacoes;

import org.javamoney.moneta.Money;

public class Pedido{

  private Money total;


  public Pedido(Money total) {
    this.total = total;
  }

  public Money getTotal() {
    return total;
  }
}
