package com.manoelcampos.exportador;

public abstract class AbstractExportadorListaProdutos implements ExportadorListaProduto {
    protected abstract Coluna criarColuna(String valor);

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "";
    }

    @Override
    public String abrirColuna(String valor) {
        return criarColuna(valor).abrir();
    }

    @Override
    public String fecharColuna() {
        return criarColuna("").fechar();
    }
}