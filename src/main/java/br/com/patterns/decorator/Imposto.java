package br.com.patterns.decorator;

public abstract class Imposto {

    protected Imposto outroImposto;

    public Imposto(Imposto outroImposto){
        this.outroImposto = outroImposto;
    }

    public Imposto(){

    }

    protected abstract double calcula(Orcamento orcamento);

    protected double calculaOutroImposto(Orcamento orcamento) {
        if(outroImposto == null) return 0;
        return outroImposto.calcula(orcamento);
    }
}
