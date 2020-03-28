package br.com.patterns.solid;

import br.com.patterns.solid.coesao.Cargo;

public class Funcionario {

    private double salarioBase;
    private Cargo cargo;

    public Funcionario(double salarioBase, Cargo cargo) {
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double calculaSalario(){
        return this.cargo.getRegra().calcula(this);
    }
}
