package com.sitecode.datadto.security;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 24/06/18
 */

public class MenuSecundarioDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idMenuSecundario;
    private Integer orden;
    private String descripcion;
    private Integer idOpciones;
    private Integer idMenuPrincipal;

    public MenuSecundarioDTO() {
    }

    public MenuSecundarioDTO(Integer code, String description) {
        super(code, description);
    }

    public MenuSecundarioDTO(Integer idMenuSecundario, Integer orden, String descripcion, Integer idOpciones,
                             Integer idMenuPrincipal) {
        this.idMenuSecundario = idMenuSecundario;
        this.orden = orden;
        this.descripcion = descripcion;
        this.idOpciones = idOpciones;
        this.idMenuPrincipal = idMenuPrincipal;
    }

    public Integer getIdMenuSecundario() {
        return idMenuSecundario;
    }

    public void setIdMenuSecundario(Integer idMenuSecundario) {
        this.idMenuSecundario = idMenuSecundario;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdOpciones() {
        return idOpciones;
    }

    public void setIdOpciones(Integer idOpciones) {
        this.idOpciones = idOpciones;
    }

    public Integer getIdMenuPrincipal() {
        return idMenuPrincipal;
    }

    public void setIdMenuPrincipal(Integer idMenuPrincipal) {
        this.idMenuPrincipal = idMenuPrincipal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MenuSecundarioDTO that = (MenuSecundarioDTO) o;

        if (!idMenuSecundario.equals(that.idMenuSecundario)) return false;
        if (!orden.equals(that.orden)) return false;
        if (!descripcion.equals(that.descripcion)) return false;
        if (!idOpciones.equals(that.idOpciones)) return false;
        return idMenuPrincipal.equals(that.idMenuPrincipal);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idMenuSecundario.hashCode();
        result = 31 * result + orden.hashCode();
        result = 31 * result + descripcion.hashCode();
        result = 31 * result + idOpciones.hashCode();
        result = 31 * result + idMenuPrincipal.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MenuSecundarioDTO{" +
                "idMenuSecundario=" + idMenuSecundario +
                ", orden=" + orden +
                ", descripcion='" + descripcion + '\'' +
                ", idOpciones=" + idOpciones +
                ", idMenuPrincipal=" + idMenuPrincipal +
                '}';
    }
}
