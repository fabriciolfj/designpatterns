package br.com.patterns.interpreter;

public class Multiplicacao implements Expressao{

    private Expressao esquerda;
    private Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int valida() {
        int resultadoEsquerda = esquerda.valida();
        int resultadoDireita = direita.valida();
        return resultadoDireita * resultadoEsquerda;
    }

    @Override
    public void aceita(Visitor visitor) {

    }
}
