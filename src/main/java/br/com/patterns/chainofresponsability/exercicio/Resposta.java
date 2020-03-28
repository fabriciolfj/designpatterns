package br.com.patterns.chainofresponsability.exercicio;


import java.util.Optional;

public interface Resposta {

    void response(Requisicao req);
    void setProxima(Optional<Resposta> resposta);
}
