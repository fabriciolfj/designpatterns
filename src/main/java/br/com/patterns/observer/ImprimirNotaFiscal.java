package br.com.patterns.observer;

import br.com.patterns.builder.NotaFiscal;

public class ImprimirNotaFiscal implements AcaoAposGerarNf {

  @Override
  public void executa(NotaFiscal nf){
    System.out.println("Imprimindo a nota fiscal por email: " + nf.toString());
  }

}
