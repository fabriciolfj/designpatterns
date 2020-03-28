package br.com.patterns.memento;

public class Estado {

  public Contrato contrato;

  public Estado(Contrato contrato) {
    this.contrato = contrato;
  }

  public void setContrato(Contrato contrato){
    this.contrato = contrato;
  }

}
