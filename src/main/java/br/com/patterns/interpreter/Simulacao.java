package br.com.patterns.interpreter;

public class Simulacao {

    /*Interpretar uma expressão, ele começa avaliando os dados de baixo da arvore até acima.
    * */
    public static void main(String[] args) {
        Soma soma = new Soma(new Numero(5), new Numero(4));
        Subtracao sub = new Subtracao(new Numero(9), new Numero(2));
        Soma result = new Soma(soma, sub);

        Multiplicacao multiplicacao = new Multiplicacao(result, new Numero(2));
        RaizQuadrada raiz = new RaizQuadrada(multiplicacao);

        System.out.println(raiz.valida());

        Visitor visitor = new VisitorImprime();
        result.aceita(visitor);
    }
}
