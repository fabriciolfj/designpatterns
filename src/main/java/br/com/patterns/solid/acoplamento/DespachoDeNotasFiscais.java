package br.com.patterns.solid.acoplamento;

public class DespachoDeNotasFiscais {

    private NotaFiscalDao dao;
    private CalculadorDeImposto impostos;
    private EnvioCorreio correio;

    public DespachoDeNotasFiscais(NotaFiscalDao dao, CalculadorDeImposto impostos/*, LeiDeEntrega lei, Correios correios*/, EnvioCorreio correio) {
        this.dao = dao;
        this.impostos = impostos;
        this.correio = correio;
        //this.lei = lei;
        //this.correios = correios;
    }

    public void processa(Notafiscal nf){
        double imposto = impostos.para(nf);
        nf.setImposto(imposto);
        correio.enviar(nf);
        /*if(lei.deveSerUrgente(nf)){
            correios.enviarPorSedex10(nf);
        }else{
            correios.enviarPorSedexComum(nf);
        }*/

        dao.executar(nf);
    }
}
