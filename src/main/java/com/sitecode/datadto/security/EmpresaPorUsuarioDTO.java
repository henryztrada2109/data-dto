package com.sitecode.datadto.security;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 6/06/18
 */

public class EmpresaPorUsuarioDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idEmpresa;
    private Integer codigo;
    private String nombre;
    private Boolean relacion;
    private Integer idUsuario;

    public EmpresaPorUsuarioDTO() {
    }

    public EmpresaPorUsuarioDTO(Integer code, String description) {
        super(code, description);
    }

    public EmpresaPorUsuarioDTO(Integer idEmpresa, Integer codigo, String nombre, Boolean relacion, Integer idUsuario) {
        this.idEmpresa = idEmpresa;
        this.codigo = codigo;
        this.nombre = nombre;
        this.relacion = relacion;
        this.idUsuario = idUsuario;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
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

    public Boolean getRelacion() {
        return relacion;
    }

    public void setRelacion(Boolean relacion) {
        this.relacion = relacion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EmpresaPorUsuarioDTO that = (EmpresaPorUsuarioDTO) o;

        if (!idEmpresa.equals(that.idEmpresa)) return false;
        if (!codigo.equals(that.codigo)) return false;
        return nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idEmpresa.hashCode();
        result = 31 * result + codigo.hashCode();
        result = 31 * result + nombre.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "EmpresaDTO{" +
                "idEmpresa=" + idEmpresa +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", relacion='" + relacion + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                '}';
    }
}
