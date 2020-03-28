package br.com.patterns.operacoes;

import java.math.BigDecimal;
import java.util.Optional;
import org.javamoney.moneta.Money;

public class Others {

  public static void main(String[] args) {
    Pedido pedido = new Pedido(Money.of(new BigDecimal(100), "BRL"));
    Money money = Money.of(new BigDecimal(99), "BRL");
    Optional.ofNullable(pedido)
        .filter(t -> t.getTotal().isLessThan(money))
        .orElseThrow(() -> new RuntimeException("Divergence for value smaller than the original is not implemented yet"));
  }

}
