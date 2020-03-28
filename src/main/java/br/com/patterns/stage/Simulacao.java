package br.com.patterns.stage;

public class Simulacao {

  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(500.00);
    orcamento.aplicaDescontoExtra();

    System.out.println(orcamento.valor);

    orcamento.aprova();
    orcamento.aplicaDescontoExtra();
    System.out.println(orcamento.valor);

    orcamento.finaliza();
  }

}
