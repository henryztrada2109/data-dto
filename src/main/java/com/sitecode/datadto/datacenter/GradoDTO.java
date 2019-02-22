package com.sitecode.datadto.datacenter;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 10/07/18
 */

public class GradoDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idGrado;
    private Integer orden;
    private String nombre;
    private Integer idTipoMenu;
    private Integer cantidadSecciones;
    private BigDecimal costoInscripcion;
    private BigDecimal costoCuota;
    private Integer idRole;
    private Integer cantidadCuotas;

    public GradoDTO() {
    }

    public GradoDTO(Integer code, String description) {
        super(code, description);
    }

    public GradoDTO(Integer idGrado, Integer orden, String nombre, Integer idTipoMenu, Integer cantidadSecciones,
                    BigDecimal costoInscripcion, BigDecimal costoCuota, Integer idRole, Integer cantidadCuotas) {
        this.idGrado = idGrado;
        this.orden = orden;
        this.nombre = nombre;
        this.idTipoMenu = idTipoMenu;
        this.cantidadSecciones = cantidadSecciones;
        this.costoInscripcion = costoInscripcion;
        this.costoCuota = costoCuota;
        this.idRole = idRole;
        this.cantidadCuotas = cantidadCuotas;
    }

    public Integer getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(Integer idGrado) {
        this.idGrado = idGrado;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdTipoMenu() {
        return idTipoMenu;
    }

    public void setIdTipoMenu(Integer idTipoMenu) {
        this.idTipoMenu = idTipoMenu;
    }

    public Integer getCantidadSecciones() {
        return cantidadSecciones;
    }

    public void setCantidadSecciones(Integer cantidadSecciones) {
        this.cantidadSecciones = cantidadSecciones;
    }

    public BigDecimal getCostoInscripcion() {
        return costoInscripcion;
    }

    public void setCostoInscripcion(BigDecimal costoInscripcion) {
        this.costoInscripcion = costoInscripcion;
    }

    public BigDecimal getCostoCuota() {
        return costoCuota;
    }

    public void setCostoCuota(BigDecimal costoCuota) {
        this.costoCuota = costoCuota;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GradoDTO gradoDTO = (GradoDTO) o;
        return Objects.equals(idGrado, gradoDTO.idGrado) &&
                Objects.equals(orden, gradoDTO.orden) &&
                Objects.equals(nombre, gradoDTO.nombre) &&
                Objects.equals(idTipoMenu, gradoDTO.idTipoMenu) &&
                Objects.equals(cantidadSecciones, gradoDTO.cantidadSecciones) &&
                Objects.equals(costoInscripcion, gradoDTO.costoInscripcion) &&
                Objects.equals(costoCuota, gradoDTO.costoCuota) &&
                Objects.equals(idRole, gradoDTO.idRole) &&
                Objects.equals(cantidadCuotas, gradoDTO.cantidadCuotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idGrado, orden, nombre, idTipoMenu, cantidadSecciones, costoInscripcion,
                costoCuota, idRole, cantidadCuotas);
    }

    @Override
    public String toString() {
        return "GradoDTO{" +
                "idGrado=" + idGrado +
                ", orden=" + orden +
                ", nombre='" + nombre + '\'' +
                ", idTipoMenu=" + idTipoMenu +
                ", cantidadSecciones=" + cantidadSecciones +
                ", costoInscripcion=" + costoInscripcion +
                ", costoCuota=" + costoCuota +
                ", idRole=" + idRole +
                ", cantidadCuotas=" + cantidadCuotas +
                '}';
    }

}
