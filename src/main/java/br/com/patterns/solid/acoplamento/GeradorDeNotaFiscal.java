package br.com.patterns.solid.acoplamento;


import java.util.List;
import java.util.Optional;

public class GeradorDeNotaFiscal {

    private List<AcaoAposGerarNotaFiscal> acoes;

    public GeradorDeNotaFiscal(List<AcaoAposGerarNotaFiscal> acoes){
        this.acoes = acoes;
    }

    public Notafiscal gera(double valor){
        return Optional.of(new Notafiscal(valor, impostoSimples(valor))).map(nf -> {
            this.acoes.stream().forEach(c -> c.executar(nf));
            return nf;
        }).get();

    }

    private double impostoSimples(double valor) {
        return valor * 0.06;
    }
}
