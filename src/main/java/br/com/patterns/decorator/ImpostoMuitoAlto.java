package br.com.patterns.decorator;

public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto(){

    }

    public ImpostoMuitoAlto(Imposto imposto){
        super(imposto);
    }


    @Override
    protected double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.2 + outroImposto.calcula(orcamento);
    }
}
