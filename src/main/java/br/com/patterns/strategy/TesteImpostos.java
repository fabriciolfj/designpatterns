package br.com.patterns.strategy;

public class TesteImpostos {

    public static void main(String[] args) {
        Imposto icms = new ICMS();
        Imposto iss = new ISS();

        Orcamento orcamento = new Orcamento(500);
        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

        calculadora.realizaCalculo(orcamento, icms);
        calculadora.realizaCalculo(orcamento, iss);
    }
}
