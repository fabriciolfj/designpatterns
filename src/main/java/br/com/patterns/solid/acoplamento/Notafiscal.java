package br.com.patterns.solid.acoplamento;

public class Notafiscal {

    private double valor;
    private double imposto;

    public Notafiscal(double valor, double imposto){
        this.valor = valor;
        this.imposto = imposto;
    }

    public double getImposto() {
        return imposto;
    }

    public double getValor() {
        return valor;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Notafiscal{" +
                "valor=" + valor +
                ", imposto=" + imposto +
                '}';
    }
}

