package com.example.rh.app.ws.enums;
/**
 * @author Ryller Oliveira
 */

public enum EnumTipoCategoria {
    APRESENTACAO_PESSOAL("Apresentação pessoal"),
    DIDATICA("Didática"),
    COMPROMENTIMENTO("Compromentimento"),
    EXTRA_CLASSE("Extra classe");

    private String descricao;

    EnumTipoCategoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
