package br.com.patterns.solid;

import br.com.patterns.solid.coesao.Cargo;

public class Simulacao {
    public static void main(String[] args) {
        Funcionario f = new Funcionario(1000.00, Cargo.DESENVOLVEDOR);
        System.out.println(f.calculaSalario());
    }
}
