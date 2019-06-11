package com.example.rh.app.ws.model;

import javax.persistence.*;
import java.util.Objects;

public class CompetenciaAvaliacaoIn {

    private String nomeTipoCompetencia;
    private String nomeCompetencia;
    private String descricaoCompetencia;
    private int pesoCompetencia;
    private int escala;
    private int valorEstrategico;


    public String getNomeTipoCompetencia() {
        return nomeTipoCompetencia;
    }

    public void setNomeTipoCompetencia(String nomeTipoCompetencia) {
        this.nomeTipoCompetencia = nomeTipoCompetencia;
    }

    public String getNomeCompetencia() {
        return nomeCompetencia;
    }

    public void setNomeCompetencia(String nomeCompetencia) {
        this.nomeCompetencia = nomeCompetencia;
    }

    public String getDescricaoCompetencia() {
        return descricaoCompetencia;
    }

    public void setDescricaoCompetencia(String descricaoCompetencia) {
        this.descricaoCompetencia = descricaoCompetencia;
    }

    public int getPesoCompetencia() {
        return pesoCompetencia;
    }

    public void setPesoCompetencia(int pesoCompetencia) {
        this.pesoCompetencia = pesoCompetencia;
    }

    public int getEscala() {
        return escala;
    }

    public void setEscala(int escala) {
        this.escala = escala;
    }

    public int getValorEstrategico() {
        return valorEstrategico;
    }

    public void setValorEstrategico(int valorEstrategico) {
        this.valorEstrategico = valorEstrategico;
    }

}
