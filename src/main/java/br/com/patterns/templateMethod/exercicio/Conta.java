package br.com.patterns.templateMethod.exercicio;

public class Conta {

    private String banco;
    private String endereco;
    private String agencia;
    private Integer numero;

    public Conta(String banco, String endereco, String agencia, Integer numero) {
        this.banco = banco;
        this.endereco = endereco;
        this.agencia = agencia;
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }
}
