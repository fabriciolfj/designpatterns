package br.com.patterns.observer;

import br.com.patterns.builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNf {

  @Override
  public void executa(NotaFiscal nf){
    System.out.println("Enviando a nota fiscal por email: " + nf.toString());
  }

}
