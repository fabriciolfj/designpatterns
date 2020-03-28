package br.com.patterns.decorator;

//quando possuo objetos compostos por exemplo, ou juntar comportamentos separadas, decoramos o icms com o imposto icpp e etc.
public class TesteDeImpostosComplexos {

    public static void main(String[] args) {
        //Imposto iss = new ImpostoMuitoAlto(new ICMS());
        Imposto icpp = new ICPP(new IKCV());

        Orcamento orcamento = new Orcamento(100);

        double valor = icpp.calcula(orcamento);

        System.out.println(valor);
    }
}
