package com.sitecode.datadto.security;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 1/06/18
 */

public class RoleDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idRole;
    private Integer codigo;
    private String nombre;

    public RoleDTO() {
    }

    public RoleDTO(Integer code, String description) {
        super(code, description);
    }

    public RoleDTO(Integer idRole, Integer codigo, String nombre) {
        this.idRole = idRole;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RoleDTO roleDTO = (RoleDTO) o;

        if (!idRole.equals(roleDTO.idRole)) return false;
        if (!codigo.equals(roleDTO.codigo)) return false;
        return nombre.equals(roleDTO.nombre);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idRole.hashCode();
        result = 31 * result + codigo.hashCode();
        result = 31 * result + nombre.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "idRole=" + idRole +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
