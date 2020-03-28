package br.com.patterns.solid.coesao;

import br.com.patterns.solid.Funcionario;

public class QuinzeOuVinteCincoPorCento implements RealizaCalculo {
    @Override
    public double calcula(Funcionario f) {
        if(f.getSalarioBase() > 2000.00){
            return f.getSalarioBase() * 0.75;
        }

        return f.getSalarioBase() * 0.85;
    }
}
