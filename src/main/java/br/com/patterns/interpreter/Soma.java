package br.com.patterns.interpreter;

public class Soma implements Expressao {

    private Expressao direita;
    private Expressao esquerda;

    public Soma(Expressao direita, Expressao esquerda) {
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public int valida() {
        int resultDireita = direita.valida();
        int resultEsquerda = esquerda.valida();
        return resultDireita + resultEsquerda;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaSoma(this);
    }

    public Expressao getDireita() {
        return direita;
    }

    public void setDireita(Expressao direita) {
        this.direita = direita;
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Expressao esquerda) {
        this.esquerda = esquerda;
    }
}
