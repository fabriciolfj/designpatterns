package br.com.patterns.templateMethod;


public class Simulador {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(600);
        orcamento.adicionar(new Item("Lapis", 120));
        orcamento.adicionar(new Item("Borracha", 100));

        /*ICPP icpp = new ICPP();
        System.out.println(icpp.calcula(orcamento));

        IKCV ikcv = new IKCV();
        System.out.println(ikcv.calcula(orcamento));*/

        IHIT ihit = new IHIT();
        System.out.println(ihit.calcula(orcamento));
    }
}
