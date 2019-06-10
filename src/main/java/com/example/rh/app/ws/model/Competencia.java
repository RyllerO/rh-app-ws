package com.example.rh.app.ws.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * @author Ryller Oliveira
 */

@Entity
@Table(name = "competencia")
@Embeddable
public class Competencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_tipo_competencia")
    private TipoCompetencia tipoCompetencia;

    @NotNull
    private String nome;

    private String descricao;

    @NotNull
    private int peso;

    private int escala;

    private int valorEstrategico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoCompetencia getTipoCompetencia() {
        return tipoCompetencia;
    }

    public void setTipoCompetencia(TipoCompetencia tipoCompetencia) {
        this.tipoCompetencia = tipoCompetencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Competencia that = (Competencia) o;
        return peso == that.peso &&
                escala == that.escala &&
                valorEstrategico == that.valorEstrategico &&
                id.equals(that.id) &&
                tipoCompetencia.equals(that.tipoCompetencia) &&
                nome.equals(that.nome) &&
                Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoCompetencia, nome, descricao, peso, escala, valorEstrategico);
    }
}
