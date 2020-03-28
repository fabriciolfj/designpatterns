package br.com.patterns.templateMethod.exercicio;

public class RelatorioSimples extends TemplateRelatorio {
    @Override
    protected boolean relatorioComplexo() {
        return false;
    }

    @Override
    protected boolean relatorioSimples() {
        return true;
    }
}
