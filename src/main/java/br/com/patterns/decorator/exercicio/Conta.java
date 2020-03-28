package br.com.patterns.decorator.exercicio;

import java.time.LocalDate;

public class Conta {

    private double saldo;
    private LocalDate dataAbertura;

    public Conta(){}

    public Conta(double saldo, LocalDate dataAbertura) {
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", dataAbertura=" + dataAbertura +
                '}';
    }
}
