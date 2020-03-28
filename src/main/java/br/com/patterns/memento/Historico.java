package br.com.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

  public List<Estado> estados = new ArrayList<>();

  public void guardarEstado(Estado estado){
    this.estados.add(estado);
  }

  public Estado getEstado(int index){
    return this.estados.get(index);
  }

}
