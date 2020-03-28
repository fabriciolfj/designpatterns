package br.com.patterns.chainofresponsability;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto desconto;

    public double desconto(Orcamento orcamento){
        if(orcamento.getValor() > 500){
            return orcamento.getValor() * 0.07;
        }else{
            return desconto.desconto(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.desconto = proximo;
    }
}
