package br.com.patterns.interpreter;

public interface Visitor {

    void visitaSoma(Soma soma);
    void visitaSubtracao(Subtracao subtracao);
    void visitaNumero(Numero numero);
}
