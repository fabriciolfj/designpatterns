package br.com.patterns.memento;

public class Contrato {

  private String nome;
  private Status status;

  public Contrato(String nome, Status status) {
    this.nome = nome;
    this.status = status;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public void avanca(){
    if(status == Status.NOVO){
      status = Status.ANDAMENTO;
      return;
    }

    if(status == Status.ANDAMENTO){
      status = Status.ANALISE;
      return;
    }

    if(status == Status.ANALISE){
      status = Status.FECHADO;
      return;
    }
  }

  public Estado salvarEstado(){
    return new Estado(new Contrato(this.nome, this.status));
  }

}
