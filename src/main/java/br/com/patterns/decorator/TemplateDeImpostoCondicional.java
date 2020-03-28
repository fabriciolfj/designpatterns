package br.com.patterns.decorator;


public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional(){

    }

    public TemplateDeImpostoCondicional(Imposto outroImposto){
        super(outroImposto);
    }

    @Override
    public final double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento) + calculaOutroImposto(orcamento);
        }

        return minimaTaxacao(orcamento)+ calculaOutroImposto(orcamento);
    }

    protected abstract double minimaTaxacao(Orcamento orcamento);
    protected abstract double maximaTaxacao(Orcamento orcamento);
    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
