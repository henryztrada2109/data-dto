package com.sitecode.datadto.security;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 1/06/18
 */

public class UsuarioDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idUsuario;
    private String usuarioApp;
    private String pass;
    private Integer idRole;
    private String descripcionRol;
    private Integer tipoMenu;
    private Integer estado;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Integer code, String description) {
        super(code, description);
    }

    public UsuarioDTO(Integer idUsuario, String usuarioApp, String pass, Integer idRole, String descripcionRol,
                      Integer tipoMenu, Integer estado) {
        this.idUsuario = idUsuario;
        this.usuarioApp = usuarioApp;
        this.pass = pass;
        this.idRole = idRole;
        this.descripcionRol = descripcionRol;
        this.tipoMenu = tipoMenu;
        this.estado = estado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuarioApp() {
        return usuarioApp;
    }

    public void setUsuarioApp(String usuarioApp) {
        this.usuarioApp = usuarioApp;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    public Integer getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(Integer tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        UsuarioDTO that = (UsuarioDTO) o;

        if (!idUsuario.equals(that.idUsuario)) return false;
        if (!usuarioApp.equals(that.usuarioApp)) return false;
        if (!pass.equals(that.pass)) return false;
        if (!idRole.equals(that.idRole)) return false;
        return descripcionRol.equals(that.descripcionRol);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idUsuario.hashCode();
        result = 31 * result + usuarioApp.hashCode();
        result = 31 * result + pass.hashCode();
        result = 31 * result + idRole.hashCode();
        result = 31 * result + descripcionRol.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "idUsuario=" + idUsuario +
                ", usuarioApp='" + usuarioApp + '\'' +
                ", pass='" + pass + '\'' +
                ", idRole=" + idRole +
                ", descripcionRol='" + descripcionRol + '\'' +
                ", estado=" + estado +
                '}';
    }
}
