package com.sitecode.datadto.datacenter;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 17/08/18
 */

public class ProfesionDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idProfesion;
    private String descripcion;

    public ProfesionDTO() {
    }

    public ProfesionDTO(Integer code, String description) {
        super(code, description);
    }

    public ProfesionDTO(Integer idProfesion, String descripcion, Integer validador) {
        this.idProfesion = idProfesion;
        this.descripcion = descripcion;
    }

    public Integer getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(Integer idProfesion) {
        this.idProfesion = idProfesion;
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
        ProfesionDTO that = (ProfesionDTO) o;
        return Objects.equals(idProfesion, that.idProfesion) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idProfesion, descripcion);
    }

    @Override
    public String toString() {
        return "ProfesionDTO{" +
                "idProfesion=" + idProfesion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
