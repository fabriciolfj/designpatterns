package br.com.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class ListaComandos {

    public List<Command> commands = new ArrayList<>();

    public void executa(){
        commands.forEach(c -> c.executa());
    }

    public void add(Command command){
        this.commands.add(command);
    }
}
