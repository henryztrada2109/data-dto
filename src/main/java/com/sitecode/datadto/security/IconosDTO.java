package com.sitecode.datadto.security;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 22/06/18
 */

public class IconosDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idIcono;
    private String nombre;
    private String clase;

    public IconosDTO() {
    }

    public IconosDTO(Integer idIcono, String nombre, String clase) {
        this.idIcono = idIcono;
        this.nombre = nombre;
        this.clase = clase;
    }

    public Integer getIdIcono() {
        return idIcono;
    }

    public void setIdIcono(Integer idIcono) {
        this.idIcono = idIcono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        IconosDTO iconosDTO = (IconosDTO) o;

        if (!idIcono.equals(iconosDTO.idIcono)) return false;
        if (!nombre.equals(iconosDTO.nombre)) return false;
        return clase.equals(iconosDTO.clase);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idIcono.hashCode();
        result = 31 * result + nombre.hashCode();
        result = 31 * result + clase.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "IconosDTO{" +
                "idIcono=" + idIcono +
                ", nombre='" + nombre + '\'' +
                ", clase='" + clase + '\'' +
                '}';
    }
}
