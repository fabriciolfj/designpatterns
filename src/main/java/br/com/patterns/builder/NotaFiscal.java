package br.com.patterns.builder;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscal {

  private String razaoSocial;
  private String cnpj;
  private LocalDate dataEmissao;
  private double valorBruto;
  private double impostos;
  public List<ItemDaNota> itens;
  private String observacao;

  public NotaFiscal(String razaoSocial, String cnpj, LocalDate dataEmissao, double valorBruto,
      double impostos, List<ItemDaNota> itens, String observacao) {
    this.razaoSocial = razaoSocial;
    this.cnpj = cnpj;
    this.dataEmissao = dataEmissao;
    this.valorBruto = valorBruto;
    this.impostos = impostos;
    this.itens = itens;
    this.observacao = observacao;
  }

  public String getRazaoSocial() {
    return razaoSocial;
  }

  public String getCnpj() {
    return cnpj;
  }

  public LocalDate getDataEmissao() {
    return dataEmissao;
  }

  public double getValorBruto() {
    return valorBruto;
  }

  public double getImpostos() {
    return impostos;
  }

  public List<ItemDaNota> getItens() {
    return itens;
  }

  public String getObservacao() {
    return observacao;
  }

  @Override
  public String toString() {
    return "NotaFiscal{" +
        "razaoSocial='" + razaoSocial + '\'' +
        ", cnpj='" + cnpj + '\'' +
        ", dataEmissao=" + dataEmissao +
        ", valorBruto=" + valorBruto +
        ", impostos=" + impostos +
        ", itens=" + itens +
        ", observacao='" + observacao + '\'' +
        '}';
  }
}
