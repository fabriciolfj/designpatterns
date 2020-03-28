package br.com.patterns.solid.acoplamento;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal{

    @Override
    public void executar(Notafiscal notafiscal) {
        System.out.println("Enviando:" + notafiscal);
    }
}
