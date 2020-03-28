package br.com.patterns.solid.acoplamento;

public class LeiDeEntrega {

    public boolean deveSerUrgente(Notafiscal notafiscal){
        return notafiscal.getValor() > 100;
    }
}
