package br.com.patterns.command;

import java.math.BigDecimal;
import java.util.List;

public class Simulacao {

    public static void main(String[] args) {
        ListaComandos comandos = new ListaComandos();

        Pedido pedido = new Pedido("Fabricio", new BigDecimal(10.00));
        comandos.add(new Pagar(pedido));
        comandos.add(new Estoque(pedido));

        comandos.executa();
    }
}
