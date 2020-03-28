package br.com.patterns.stage.exercicio;

public class Simulacao {

  public static void main(String[] args) {
    Conta conta = new Conta(100);
    System.out.println("Saldo inicial: " + conta.saldo);

    conta.saque(10);
    System.out.println("Saldo após primeiro saque: " + conta.saldo);

    conta.deposito(20);
    System.out.println("Saldo após primeiro deposito:" + conta.saldo);


    conta.saque(160);
    System.out.println("Saldo após segundo saque:" + conta.saldo);

    conta.deposito(50);
    System.out.println("Saldo após segundo deposito:" + conta.saldo);

    conta.saque(10);
  }

}
