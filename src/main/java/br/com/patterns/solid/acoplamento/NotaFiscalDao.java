package br.com.patterns.solid.acoplamento;

public class NotaFiscalDao implements AcaoAposGerarNotaFiscal {

    @Override
    public void executar(Notafiscal notafiscal) {
        System.out.println("Salvando: " + notafiscal);
    }
}
