package br.com.patterns.solid.coesao;

import br.com.patterns.solid.Funcionario;

public class DezOuVintePorcento implements RealizaCalculo {
    @Override
    public double calcula(Funcionario f) {
        if(f.getSalarioBase() > 3000.00){
            return f.getSalarioBase() * 0.08;
        }

        return f.getSalarioBase() * 0.09;
    }
}
