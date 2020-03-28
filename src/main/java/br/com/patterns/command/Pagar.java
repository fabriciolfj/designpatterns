package br.com.patterns.command;

public class Pagar implements Command {

    private Pedido pedido;

    public Pagar(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
        System.out.println("Pagando o pedido: " + pedido.getCliente());
    }
}
