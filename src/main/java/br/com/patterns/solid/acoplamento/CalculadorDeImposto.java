package br.com.patterns.solid.acoplamento;

public class CalculadorDeImposto {

    public double para(Notafiscal nf){
        return nf.getValor() * 0.06;
    }
}
