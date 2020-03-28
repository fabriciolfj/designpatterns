package br.com.patterns.templateMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private final double valor;
    private List<Item> itens;


    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
    }

    public double getValor() {
        return valor;
    }

    public void adicionar(Item item){
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public boolean contemItemDeNome(String nomeDoItem){
        if(this.itens.stream().filter(p -> p.getNome().equals(nomeDoItem)).count() == 1){
            return true;
        }

        return false;
    }
}
