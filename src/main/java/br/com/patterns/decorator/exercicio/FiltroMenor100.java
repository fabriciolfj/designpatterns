package br.com.patterns.decorator.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroMenor100 extends Filtro {

    public FiltroMenor100(){
        super();
    }

    public FiltroMenor100(Filtro filtro){
        super(filtro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtradas = contas.stream().filter(c -> c.getSaldo() < 100).collect(Collectors.toList());
        return aplicarOutroFilro(filtradas);
    }
}
