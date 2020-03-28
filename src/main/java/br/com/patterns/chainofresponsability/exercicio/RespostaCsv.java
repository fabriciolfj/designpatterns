package br.com.patterns.chainofresponsability.exercicio;

import java.util.Optional;

public class RespostaCsv implements Resposta {
    private Optional<Resposta> resposta = Optional.empty();

    @Override
    public void response(Requisicao req) {
        if(req.getFormato() == Formato.CSV){
            System.out.println(req.getConta().getTitular() + ";" + req.getConta().getSaldo());
            return;
        }

        resposta.ifPresent(resp -> resp.response(req));
    }

    @Override
    public void setProxima(Optional<Resposta> resposta) {
        this.resposta = resposta;
    }
}
