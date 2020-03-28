package br.com.patterns.memento;

public class Simulador {

  public static void main(String[] args) {
    Contrato contrato = new Contrato("Teste", Status.NOVO);
    Historico historico = new Historico();

    historico.guardarEstado(contrato.salvarEstado());
    contrato.avanca();
    System.out.println(contrato.getStatus());

    historico.guardarEstado(contrato.salvarEstado());
    contrato.avanca();
    System.out.println(contrato.getStatus());

    historico.guardarEstado(contrato.salvarEstado());
    contrato.avanca();
    System.out.println(contrato.getStatus());

    contrato = historico.getEstado(0).contrato;
    System.out.println(contrato.getStatus());
  }

}
