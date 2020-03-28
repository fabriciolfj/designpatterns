package br.com.patterns.solid.acoplamento;

public class EnvioCorreio {

    private Correios correios;
    private LeiDeEntrega lei;

    public EnvioCorreio() {
        this.correios = new Correios();
        this.lei = new LeiDeEntrega();
    }

    public void enviar(Notafiscal nf){
        if(lei.deveSerUrgente(nf)){
            correios.enviarPorSedex10(nf);
        }else{
            correios.enviarPorSedexComum(nf);
        }
    }
}
