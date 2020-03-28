package br.com.patterns.chainofresponsability;

public class DescontoVendaCasada implements Desconto {

    private Desconto proximo;

    @Override
    public double desconto(Orcamento orcamento) {
        if(isExistsVendaCasada(orcamento)){
            return orcamento.getValor() * 0.05;
        }

        return proximo.desconto(orcamento);
    }

    private boolean isExistsVendaCasada(Orcamento orcamento){
        if(orcamento.contemItemDeNome("Lapis") && orcamento.contemItemDeNome("Caneta")){
            return true;
        }

        return  false;
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
