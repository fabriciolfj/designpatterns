package br.com.patterns.templateMethod;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class IHIT extends TemplateDeImpostoCondicional {

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.01;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        boolean result =  possuiItensRepetidos(orcamento);
        return result;
    }

    private boolean possuiItensRepetidos(Orcamento orcamento){
        List<String> noOrcamento = new ArrayList<>();
        return orcamento.getItens().stream().filter(item -> {
            if (noOrcamento.contains(item.getNome())) {
                return true;
            } else {
                noOrcamento.add(item.getNome());
            }

            return false;
        }).count() > 0;
    }
}
