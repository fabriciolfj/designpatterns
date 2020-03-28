package br.com.patterns.chainofresponsability.exercicio;

import java.util.Optional;

public class Simulador {

    public static void main(String[] args) {
        Conta conta = new Conta("Fabricio", 100.00);

        Requisicao req = new Requisicao(Formato.XML, conta);

        Resposta xml = new RespostaEmXml();
        Resposta csv = new RespostaCsv();


        xml.setProxima(Optional.of(csv));
        xml.response(req);
        csv.response(req);

    }
}
