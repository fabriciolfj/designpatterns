package br.com.patterns.strategy.exercicio;

public class Simulacao {


    public static void main(String[] args) {
        Conta conta = new Conta(100.00);
        RealizaInvestimentos realizaInvestimentos = new RealizaInvestimentos();

        Investimento conservador = new Conservador();
        Investimento moderado = new Moderado();
        Investimento arrojado = new Arrojado();

        realizaInvestimentos.realiza(conta, conservador);
        realizaInvestimentos.realiza(conta, moderado);
        realizaInvestimentos.realiza(conta, arrojado);

    }
}
