package br.com.patterns.stage;

import br.com.patterns.templateMethod.Item;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    protected double valor;
    private List<Item> itens;
    protected EstadoDeUmOrcamento estadoAtual;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
        this.estadoAtual = new EmAprovacao();
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

    public void aplicaDescontoExtra(){
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova(){
        this.estadoAtual.aprova(this);
    }

    public void reprova(){
        this.estadoAtual.reprova(this);
    }

    public void finaliza(){
        this.estadoAtual.finaliza(this);
    }
}
