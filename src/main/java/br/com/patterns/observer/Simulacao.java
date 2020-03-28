package br.com.patterns.observer;

import br.com.patterns.builder.ItemDataNotaBuilder;
import br.com.patterns.builder.NotaFiscal;
import br.com.patterns.builder.NotaFiscalBuilder;
import java.time.LocalDate;

public class Simulacao {

  public static void main(String[] args) {
    NotaFiscalBuilder nf = new NotaFiscalBuilder(); //interface fluent
    nf.adicionarAcao(new EnviadorDeEmail());
    nf.adicionarAcao(new NotaFiscalDao());
    nf.adicionarAcao(new ImprimirNotaFiscal());

    nf.paraEmpresa("Caelum Ensino e Inovação")
        .com("12.345.678/0001-12")
        .com(new ItemDataNotaBuilder().comNome("Item 1").comValor(100.00).builder())
        .com(new ItemDataNotaBuilder().comNome("Item 2").comValor(300.00).builder())
        .com(new ItemDataNotaBuilder().comNome("Item 3").comValor(400.00).builder())
        .comObs("observações")
        .com(LocalDate.of(2018,12,9))
        .builder();


    System.out.println(nf);
  }

}
