package br.com.patterns.decorator.exercicio;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroDataMesCorrente extends Filtro {
    private Filtro filtro;

    public FiltroDataMesCorrente(){

    }

    public FiltroDataMesCorrente(Filtro filtro){
        super(filtro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtradas = contas.stream().filter(p -> {
            if(p.getDataAbertura().getMonthValue() == LocalDate.now().getMonthValue() && p.getDataAbertura().getYear() == LocalDate.now().getYear()){
                return true;
            }
            return false;
        }).collect(Collectors.toList());

        return aplicarOutroFilro(filtradas);
    }
}
