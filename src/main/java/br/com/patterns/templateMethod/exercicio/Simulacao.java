package br.com.patterns.templateMethod.exercicio;

public class Simulacao {

    public static void main(String[] args) {
        Conta conta = new Conta("Santander", "Rua Antenor Barbosa", "883", 2233);
        System.out.println("--------------------------------------");
        Relatorio complexo = new RelatorioComplexo();
        complexo.imprimir(conta);

        System.out.println("--------------------------------------");
        Relatorio simples = new RelatorioSimples();
        simples.imprimir(conta);
    }
}
