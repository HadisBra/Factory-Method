package com.manoelcampos.exportador;

import com.manoelcampos.exportador.ExportadorListaProdutoCSV;
import com.manoelcampos.exportador.ExportadorListaProdutoHtml;
import com.manoelcampos.exportador.ExportadorListaProdutoMarkdown;

import java.util.List;

public interface ExportadorListaProduto {
    // ... restante do código ...

    static ExportadorListaProduto newInstance(String extensaoArqExportacao){
        return switch (extensaoArqExportacao) {
            case "html" -> new ExportadorListaProdutoHtml();
            case "md" -> new ExportadorListaProdutoMarkdown();
            case "csv" -> new ExportadorListaProdutoCSV();
            default -> throw new UnsupportedOperationException("Formato de arquivo não suportado: " + extensaoArqExportacao);
        };
    }

    String abrirTabela();

    String fecharTabela();

    String abrirLinha();

    String fecharLinha();

    String abrirLinhaTitulos();

    String fecharLinhaTitulos();

    String abrirColuna(String valor);

    String fecharColuna();

    String exportar(List<Produto> listaProdutos);
}