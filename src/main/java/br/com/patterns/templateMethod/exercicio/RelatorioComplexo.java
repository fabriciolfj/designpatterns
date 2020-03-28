package br.com.patterns.templateMethod.exercicio;

public class RelatorioComplexo extends TemplateRelatorio {
    @Override
    protected boolean relatorioComplexo() {
        return true;
    }

    @Override
    protected boolean relatorioSimples() {
        return false;
    }
}
