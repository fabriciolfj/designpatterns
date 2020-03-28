package br.com.patterns.chainofresponsability;

public class DescontoPorCincoItens implements Desconto {

    private Desconto desconto;

    public double desconto(Orcamento orcamento){
        if(orcamento.getItens().size() > 5){
            return orcamento.getValor() * 0.1;
        }else{
            return desconto.desconto(orcamento);
        }

    }

    @Override
    public void setProximo(Desconto proximo) {
        this.desconto = proximo;
    }
}
