package com.example.rh.app.ws.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * @author Ryller Oliveira
 */
@Entity
@Table(name = "avaliacao")
public class Avaliacao {
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String membroAvaliador;

    @NotNull
    private String departamento;

    @NotNull
    private String professorAvaliado;

    @NotNull
    private LocalDateTime data;

    @NotNull
    private int totalAvaliadores;

    @NotNull
    private String avaliadorResponsavel;

    @Embedded
    private List<Competencia> competencias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMembroAvaliador() {
        return membroAvaliador;
    }

    public void setMembroAvaliador(String membroAvaliador) {
        this.membroAvaliador = membroAvaliador;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProfessorAvaliado() {
        return professorAvaliado;
    }

    public void setProfessorAvaliado(String professorAvaliado) {
        this.professorAvaliado = professorAvaliado;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getTotalAvaliadores() {
        return totalAvaliadores;
    }

    public void setTotalAvaliadores(int totalAvaliadores) {
        this.totalAvaliadores = totalAvaliadores;
    }

    public String getAvaliadorResponsavel() {
        return avaliadorResponsavel;
    }

    public void setAvaliadorResponsavel(String avaliadorResponsavel) {
        this.avaliadorResponsavel = avaliadorResponsavel;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avaliacao avaliacao = (Avaliacao) o;
        return totalAvaliadores == avaliacao.totalAvaliadores &&
                id.equals(avaliacao.id) &&
                membroAvaliador.equals(avaliacao.membroAvaliador) &&
                departamento.equals(avaliacao.departamento) &&
                professorAvaliado.equals(avaliacao.professorAvaliado) &&
                data.equals(avaliacao.data) &&
                avaliadorResponsavel.equals(avaliacao.avaliadorResponsavel) &&
                competencias.equals(avaliacao.competencias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, membroAvaliador, departamento, professorAvaliado, data, totalAvaliadores, avaliadorResponsavel, competencias);
    }
}
