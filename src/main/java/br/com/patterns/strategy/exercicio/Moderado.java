package br.com.patterns.strategy.exercicio;

import java.util.Random;

public class Moderado implements Investimento {

    private Random random = new Random();

    @Override
    public double calcula(Conta conta) {
        if(random.nextInt() % 2 == 0){
            return conta.getSaldo() * 0.025;
        }

        return conta.getSaldo() * 0.07;
    }
}
