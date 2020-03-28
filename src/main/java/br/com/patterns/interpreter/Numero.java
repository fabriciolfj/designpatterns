package br.com.patterns.interpreter;

public class Numero implements Expressao {

    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public int valida() {
        return valor;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaNumero(this);
    }

    public int getValor() {
        return valor;
    }
}
