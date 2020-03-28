package br.com.patterns.solid.acoplamento;

import java.util.Arrays;
import java.util.List;

public class Simulacao {

    public static void main(String[] args) {
        List<AcaoAposGerarNotaFiscal> acoes = Arrays.asList(new NotaFiscalDao(), new EnviadorDeEmail());
        Notafiscal nf = new GeradorDeNotaFiscal(acoes).gera(120.00);

        System.out.println("==========================");

        DespachoDeNotasFiscais despacho = new DespachoDeNotasFiscais(new NotaFiscalDao(), new CalculadorDeImposto(), new EnvioCorreio());
        despacho.processa(nf);
    }
}
