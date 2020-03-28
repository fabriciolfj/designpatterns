package br.com.patterns.command;

import java.math.BigDecimal;

public class Pedido {

    private String cliente;
    private BigDecimal total;

    public Pedido(String cliente, BigDecimal total) {
        this.cliente = cliente;
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getTotal() {
        return total;
    }
}
