package br.com.patterns.templateMethod.exercicio;

import java.time.LocalDateTime;

public abstract class TemplateRelatorio implements Relatorio {

    @Override
    public void imprimir(Conta conta) {
        if(relatorioComplexo()){
            System.out.println("====== Cabeçalho ======");
            System.out.println("Banco: " + conta.getBanco());
            System.out.println("Endereço: " + conta.getEndereco());

            System.out.println("====== Rodapé ======");
            System.out.println("Hora: " + LocalDateTime.now());
            return;
        }

        System.out.println("====== Cabeçalho ======");
        System.out.println("Banco: " + conta.getBanco());
    }

    protected abstract boolean relatorioComplexo();
    protected abstract boolean relatorioSimples();
}
