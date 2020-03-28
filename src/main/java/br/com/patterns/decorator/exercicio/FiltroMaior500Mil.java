package br.com.patterns.decorator.exercicio;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroMaior500Mil extends Filtro {

    public FiltroMaior500Mil(){
        super();
    }

    public FiltroMaior500Mil(Filtro filtro){
        super(filtro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtradas = contas.stream().filter(p -> p.getSaldo() >= 500.000).collect(Collectors.toList());
        return aplicarOutroFilro(filtradas);
    }
}
