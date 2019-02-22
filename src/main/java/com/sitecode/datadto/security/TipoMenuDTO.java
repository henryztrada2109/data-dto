package com.sitecode.datadto.security;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 1/06/18
 */

public class TipoMenuDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idTipoMenu;
    private Integer codigo;
    private String descripcion;

    public TipoMenuDTO() {
    }

    public TipoMenuDTO(Integer code, String description) {
        super(code, description);
    }

    public TipoMenuDTO(Integer idTipoMenu, Integer codigo, String descripcion) {
        this.idTipoMenu = idTipoMenu;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoMenu() {
        return idTipoMenu;
    }

    public void setIdTipoMenu(Integer idTipoMenu) {
        this.idTipoMenu = idTipoMenu;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

        TipoMenuDTO that = (TipoMenuDTO) o;

        if (!idTipoMenu.equals(that.idTipoMenu)) return false;
        if (!codigo.equals(that.codigo)) return false;
        return descripcion.equals(that.descripcion);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idTipoMenu.hashCode();
        result = 31 * result + codigo.hashCode();
        result = 31 * result + descripcion.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TipoMenuDTO{" +
                "idTipoMenu=" + idTipoMenu +
                ", codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
