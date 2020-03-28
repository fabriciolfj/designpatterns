package br.com.patterns.solid.acoplamento;

public class Correios {

    public void enviarPorSedex10(Notafiscal nf){
        System.out.println("Envio sedex 10: " + nf.toString());
    }

    public void enviarPorSedexComum(Notafiscal nf){
        System.out.println("Envio sedex comum: " + nf.toString());
    }
}
