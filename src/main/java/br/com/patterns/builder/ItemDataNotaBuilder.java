package br.com.patterns.builder;

public class ItemDataNotaBuilder {

  private String nome;
  private double valor;

  public ItemDataNotaBuilder comNome(String nome){
    this.nome = nome;
    return this;
  }

  public ItemDataNotaBuilder comValor(double valor){
    this.valor = valor;
    return this;
  }

  public ItemDaNota builder(){
    return new ItemDaNota(this.nome, this.valor);
  }

}
