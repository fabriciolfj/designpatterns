package br.com.patterns.decorator;


public class ICPP extends TemplateDeImpostoCondicional {

    public ICPP(){

    }

    public ICPP(Imposto outroImposto){
        super(outroImposto);
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
    }

    private boolean temItemMaiorQue100Reais(Orcamento orcamento){
        return orcamento.getItens().stream().filter(item -> item.getValor() > 100).count() > 0;
    }
}
