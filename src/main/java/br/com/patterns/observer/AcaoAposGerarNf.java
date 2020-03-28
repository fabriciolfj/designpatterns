package br.com.patterns.observer;

import br.com.patterns.builder.NotaFiscal;

public interface AcaoAposGerarNf {

  void executa(NotaFiscal nf);

}
