package br.com.patterns.interpreter;

public class Divisao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Divisao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int valida() {
        int resultadoDireita = direita.valida();
        int resultadoEsquerda = esquerda.valida();
        return resultadoDireita / resultadoEsquerda;
    }

    @Override
    public void aceita(Visitor visitor) {

    }
}
