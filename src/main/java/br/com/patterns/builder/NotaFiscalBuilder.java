package br.com.patterns.builder;

import br.com.patterns.observer.AcaoAposGerarNf;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {

  private String razaoSocial;
  private String cnpj;
  private List<ItemDaNota> todosItens = new ArrayList<>();
  private double valorBruto;
  private double impostos;
  private String observacoes;
  private LocalDate data;

  private List<AcaoAposGerarNf> acoes;

  public NotaFiscalBuilder(){
    acoes =  new ArrayList<>();
    this.data = LocalDate.now();
  }

  public NotaFiscalBuilder paraEmpresa(String razaoSocial){
    this.razaoSocial = razaoSocial;
    return this;
  }

  public NotaFiscalBuilder com(String cnpj){
    this.cnpj = cnpj;
    return this;
  }

  public NotaFiscalBuilder com(ItemDaNota item){
    todosItens.add(item);
    valorBruto += item.getValor();
    impostos += item.getValor() * 0.05;
    return this;
  }

  public NotaFiscalBuilder comObs(String observacoes){
    this.observacoes = observacoes;
    return this;
  }

  public NotaFiscalBuilder com(LocalDate data){
    this.data = data;
    return this;
  }

  public void adicionarAcao(AcaoAposGerarNf acao){
    this.acoes.add(acao);
  }

  public NotaFiscal builder(){
    NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
    acoes.forEach(e -> e.executa(nf));
    return nf;
  }
}
