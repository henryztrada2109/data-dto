package com.sitecode.datadto.datacenter;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 22/08/18
 */

public class EstadoCivilDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idEstado;
    private String descripcion;

    public EstadoCivilDTO() {
    }

    public EstadoCivilDTO(Integer code, String description) {
        super(code, description);
    }

    public EstadoCivilDTO(Integer idProfesion, String descripcion, Integer validador) {
        this.idEstado = idProfesion;
        this.descripcion = descripcion;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EstadoCivilDTO that = (EstadoCivilDTO) o;
        return Objects.equals(idEstado, that.idEstado) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idEstado, descripcion);
    }

    @Override
    public String toString() {
        return "EstadoCivilDTO{" +
                "idEstado=" + idEstado +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
