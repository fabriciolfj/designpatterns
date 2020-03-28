package br.com.patterns.solid.coesao;

public enum  Cargo {

    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinzeOuVinteCincoPorCento()),
    TESTER(new QuinzeOuVinteCincoPorCento());

    private RealizaCalculo regra;

    Cargo(RealizaCalculo regra){
        this.regra = regra;
    }

    public RealizaCalculo getRegra() {
        return regra;
    }
}
