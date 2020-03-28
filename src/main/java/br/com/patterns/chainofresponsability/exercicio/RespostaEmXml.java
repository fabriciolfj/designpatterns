package br.com.patterns.chainofresponsability.exercicio;

import java.util.Optional;

public class RespostaEmXml implements Resposta {

    private Optional<Resposta> resposta = Optional.empty();

    @Override
    public void response(Requisicao req) {

        if(req.getFormato() == Formato.XML){
            System.out.println("<nome> " + req.getConta().getTitular() + "</nome>");
            System.out.println("<saldo> " + req.getConta().getSaldo() + "</saldo>");
            return;
        }

        resposta.ifPresent(resp -> resp.response(req));;
    }

    @Override
    public void setProxima(Optional<Resposta> resposta) {
        this.resposta = resposta;
    }
}
