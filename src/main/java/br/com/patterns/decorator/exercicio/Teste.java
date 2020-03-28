package br.com.patterns.decorator.exercicio;

import java.util.Arrays;
import java.util.List;

import java.time.LocalDate;
/*
Sempre que percebemos que temos comportamentos que podem ser compostos por comportamentos de outras classes envolvidas em uma mesma hierarquia, como foi o caso dos impostos, que podem ser composto por outros impostos. O Decorator introduz a flexibilidade na composição desses comportamentos, bastando escolher no momento da instanciação, quais instancias serão utilizadas para realizar o trabalho.
 */

public class Teste {

    public static void main(String[] args) {
        Conta conta1 = new Conta(55, LocalDate.now());
        Conta conta2 = new Conta(10000000, LocalDate.now());
        Conta conta3 = new Conta(5000, LocalDate.of(2019, 5,11));
        Conta conta4 = new Conta(9600, LocalDate.now());
        Conta conta5 = new Conta(95, LocalDate.now());

        List<Conta> contas = Arrays.asList(conta1, conta2, conta3, conta4, conta5);
        Filtro maiorQue100 = new FiltroMenor100(new FiltroDataMesCorrente());

        List<Conta> filtradas = maiorQue100.filtra(contas);
        filtradas.stream().forEach(System.out::println);

    }
}
