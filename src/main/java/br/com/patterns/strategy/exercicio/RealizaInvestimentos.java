package br.com.patterns.strategy.exercicio;

public class RealizaInvestimentos {

    public void realiza(Conta conta, Investimento investimento){
        double resultado = investimento.calcula(conta);
        conta.deposita(resultado);
        System.out.println("Novo saldo: " + conta.getSaldo());
    }
}
