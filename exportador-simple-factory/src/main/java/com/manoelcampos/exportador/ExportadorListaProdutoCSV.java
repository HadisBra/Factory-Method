package com.manoelcampos.exportador;

import java.util.List;

public class ExportadorListaProdutoCSV implements ExportadorListaProduto {
    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public String abrirColuna(String valor) {
        return "";
    }

    @Override
    public String fecharColuna() {
        return "";
    }

    @Override
    public String exportar(List<Produto> listaProdutos) {
        StringBuilder csv = new StringBuilder("id,descricao,marca,modelo,estoque\n");

        for (int i = 0; i < listaProdutos.size(); i++) {
            Produto produto = listaProdutos.get(i);
            csv.append(i + 1).append(",")
               .append(produto.getDescricao()).append(",")
               .append(produto.getMarca()).append(",")
               .append(produto.getModelo()).append(",")
               .append(produto.getEstoque()).append("\n");
        }

        return csv.toString();
    }
}