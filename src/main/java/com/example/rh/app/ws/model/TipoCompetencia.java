package com.example.rh.app.ws.model;

import com.example.rh.app.ws.enums.EnumTipoCompetencia;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * @author Ryller Oliveira
 */

@Entity
@Table(name = "tipocompetencia")
public class TipoCompetencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private EnumTipoCompetencia nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumTipoCompetencia getNome() {
        return nome;
    }

    public void setNome(EnumTipoCompetencia nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoCompetencia that = (TipoCompetencia) o;
        return id.equals(that.id) &&
                nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
