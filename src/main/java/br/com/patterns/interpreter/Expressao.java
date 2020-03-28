package br.com.patterns.interpreter;

public interface Expressao {

    int valida();
    void aceita(Visitor visitor);
}
