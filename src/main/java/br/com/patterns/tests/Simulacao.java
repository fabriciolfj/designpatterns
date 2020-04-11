package br.com.patterns.tests;

public class Simulacao {

    public static void main(String[] args) {
        System.out.println(new Simulacao().fn(7));
    }

    private int fn(int v) {
        if(v == 1 || v == 0)
            return 1;

        if(v %2==0 ){
            return fn(v/2) + 2;
        } else {
            return fn(v -1) + 3;
        }
    }
}
