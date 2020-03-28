package br.com.patterns.chainofresponsability;

import br.com.patterns.strategy.CalculadorDeImpostos;

public class TesteDeDescontos {

    public static void main(String[] args) {
        CalculadorDeDescontos descontos = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(400.00);
        orcamento.adicionar(new Item("Caneta", 250.00));
        orcamento.adicionar(new Item("Lapis", 260.00));

        double desconto = descontos.calcula(orcamento);

        System.out.println(desconto);
    }
}
