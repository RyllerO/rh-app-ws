package com.example.rh.app.ws.enums;
/**
 * @author Ryller Oliveira
 */

public enum EnumTipoCompetencia {
    APRESENTACAO_PESSOAL("Apresentação pessoal"),
    DIDATICA("Didática"),
    COMPROMENTIMENTO("Compromentimento"),
    EXTRA_CLASSE("Extra classe");

    private String descricao;

    EnumTipoCompetencia(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
