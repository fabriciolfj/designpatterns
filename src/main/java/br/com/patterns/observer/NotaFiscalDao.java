package br.com.patterns.observer;

import br.com.patterns.builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNf{

  @Override
  public void executa(NotaFiscal nf){
    System.out.println("Salvando a nota fiscal: " + nf.toString());
  }
}
