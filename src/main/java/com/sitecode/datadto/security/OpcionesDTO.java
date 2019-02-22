package com.sitecode.datadto.security;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 22/06/18
 */

public class OpcionesDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idOpciones;
    private String descripcion;
    private String path;

    public OpcionesDTO() {
    }

    public OpcionesDTO(Integer codigo, String descripcion) {
        super(codigo, descripcion);
    }

    public OpcionesDTO(Integer idOpciones, String descripcion, String path) {
        this.idOpciones = idOpciones;
        this.descripcion = descripcion;
        this.path = path;
    }

    public Integer getIdOpciones() {
        return idOpciones;
    }

    public void setIdOpciones(Integer idOpciones) {
        this.idOpciones = idOpciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        OpcionesDTO that = (OpcionesDTO) o;

        if (!idOpciones.equals(that.idOpciones)) return false;
        if (!descripcion.equals(that.descripcion)) return false;
        return path.equals(that.path);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idOpciones.hashCode();
        result = 31 * result + descripcion.hashCode();
        result = 31 * result + path.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "OpcionesDTO{" +
                "idOpciones=" + idOpciones +
                ", descripcion='" + descripcion + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
