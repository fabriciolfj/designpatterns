package br.com.patterns.strategy.exercicio;

import java.util.Random;

public class Arrojado implements Investimento {

    private Random random = new Random();

    @Override
    public double calcula(Conta conta) {
        double value = random.nextDouble();

        if(value >= 0.5){
            return conta.getSaldo() * 0.06;
        }

        if(value >= 0.3){
            return conta.getSaldo() * 0.03;
        }

        return conta.getSaldo() * 0.5;
    }
}
