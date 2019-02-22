package com.sitecode.datadto.security;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 22/06/18
 */

public class EstructuraMenuDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idMenuPrincipal;
    private String descripcion;
    private String path;
    private String clase;
    private Integer ejecuta;
    private Boolean control;
    private Iterable<SubEstructuraMenuDTO> listadoSubEstructura;

    public EstructuraMenuDTO() {
    }

    public EstructuraMenuDTO(Integer idMenuPrincipal, String descripcion, String path, String clase, Integer ejecuta,
                             Iterable<SubEstructuraMenuDTO> listadoSubEstructura, Boolean control) {
        this.idMenuPrincipal = idMenuPrincipal;
        this.descripcion = descripcion;
        this.path = path;
        this.clase = clase;
        this.ejecuta = ejecuta;
        this.listadoSubEstructura = listadoSubEstructura;
        this.control = control;
    }

    public Integer getIdMenuPrincipal() {
        return idMenuPrincipal;
    }

    public void setIdMenuPrincipal(Integer idMenuPrincipal) {
        this.idMenuPrincipal = idMenuPrincipal;
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

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Integer getEjecuta() {
        return ejecuta;
    }

    public void setEjecuta(Integer ejecuta) {
        this.ejecuta = ejecuta;
    }

    public Iterable<SubEstructuraMenuDTO> getListadoSubEstructura() {
        return listadoSubEstructura;
    }

    public void setListadoSubEstructura(Iterable<SubEstructuraMenuDTO> listadoSubEstructura) {
        this.listadoSubEstructura = listadoSubEstructura;
    }

    public Boolean getControl() {
        return control;
    }

    public void setControl(Boolean control) {
        this.control = control;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EstructuraMenuDTO that = (EstructuraMenuDTO) o;

        if (!idMenuPrincipal.equals(that.idMenuPrincipal)) return false;
        if (!descripcion.equals(that.descripcion)) return false;
        if (!path.equals(that.path)) return false;
        if (!clase.equals(that.clase)) return false;
        if (!ejecuta.equals(that.ejecuta)) return false;
        return listadoSubEstructura.equals(that.listadoSubEstructura);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idMenuPrincipal.hashCode();
        result = 31 * result + descripcion.hashCode();
        result = 31 * result + path.hashCode();
        result = 31 * result + clase.hashCode();
        result = 31 * result + ejecuta.hashCode();
        result = 31 * result + listadoSubEstructura.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "EstructuraMenuDTO{" +
                "idMenuPrincipal=" + idMenuPrincipal +
                ", descripcion='" + descripcion + '\'' +
                ", path='" + path + '\'' +
                ", clase='" + clase + '\'' +
                ", ejecuta=" + ejecuta +
                ", listadoSubEstructura=" + listadoSubEstructura +
                '}';
    }
}
