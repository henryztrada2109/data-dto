package com.sitecode.datadto.datacenter;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 12/07/18
 */

public class SeccionDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idSeccion;
    private Integer orden;
    private String nombre;
    private Integer capacidad;
    private Integer idGrado;

    public SeccionDTO() {
    }

    public SeccionDTO(Integer code, String description) {
        super(code, description);
    }

    public SeccionDTO(Integer idSeccion, Integer orden, String nombre, Integer capacidad, Integer idGrado) {
        this.idSeccion = idSeccion;
        this.orden = orden;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.idGrado = idGrado;
    }

    public Integer getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(Integer idSeccion) {
        this.idSeccion = idSeccion;
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

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(Integer idGrado) {
        this.idGrado = idGrado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SeccionDTO that = (SeccionDTO) o;

        if (!idSeccion.equals(that.idSeccion)) return false;
        if (!orden.equals(that.orden)) return false;
        if (!nombre.equals(that.nombre)) return false;
        if (!capacidad.equals(that.capacidad)) return false;
        return idGrado.equals(that.idGrado);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idSeccion.hashCode();
        result = 31 * result + orden.hashCode();
        result = 31 * result + nombre.hashCode();
        result = 31 * result + capacidad.hashCode();
        result = 31 * result + idGrado.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SeccionDTO{" +
                "idSeccion=" + idSeccion +
                ", orden=" + orden +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", idGrado=" + idGrado +
                '}';
    }
}
