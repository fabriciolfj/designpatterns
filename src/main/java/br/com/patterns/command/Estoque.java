package br.com.patterns.command;

public class Estoque implements Command{
    private Pedido pedido;

    public Estoque(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
        System.out.println("Retirando do estoque o pedido: " + pedido.getCliente());
    }
}
