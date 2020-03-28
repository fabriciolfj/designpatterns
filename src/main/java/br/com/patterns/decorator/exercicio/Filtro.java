package br.com.patterns.decorator.exercicio;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

    protected Filtro outroFiltro;

    public Filtro(){
    }

    public Filtro(Filtro outroFiltro){
        this.outroFiltro = outroFiltro;
    }

    public abstract List<Conta> filtra(List<Conta> contas);

    public List<Conta> aplicarOutroFilro(List<Conta> contas){
        if(outroFiltro != null){
            return outroFiltro.filtra(contas);
        }

        return contas;
    }
}
