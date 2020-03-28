package br.com.patterns.interpreter;

public class RaizQuadrada implements Expressao {

    public Expressao value;

    public RaizQuadrada(Expressao value) {
        this.value = value;
    }

    @Override
    public int valida() {
        return (int) Math.sqrt(value.valida());
    }

    @Override
    public void aceita(Visitor visitor) {

    }
}
