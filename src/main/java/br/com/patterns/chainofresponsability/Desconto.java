package br.com.patterns.chainofresponsability;

public interface Desconto {

    double desconto(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
