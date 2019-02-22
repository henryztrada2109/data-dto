package com.sitecode.datadto.datacenter;

import com.sitecode.datadto.conf.ErrorDTO;

import java.io.Serializable;
import java.util.Calendar;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 10/07/18
 */

public class PeriodoDTO extends ErrorDTO implements Serializable{

    private static final long serialVersionUID = 7176428109269469686L;

    private Integer idPeriodo;
    private String descripcion;
    private Integer anioInicio;
    private Integer mesInicio;
    private Integer diaInicio;
    private Integer anioFin;
    private Integer mesFin;
    private Integer diaFin;
    private Boolean periodoActual;

    public PeriodoDTO() {
    }

    public PeriodoDTO(Integer code, String description) {
        super(code, description);
    }

    public PeriodoDTO(Integer idPeriodo, String descripcion, Integer anioInicio, Integer mesInicio, Integer diaInicio,
                      Integer anioFin, Integer mesFin, Integer diaFin, Boolean periodoActual) {
        this.idPeriodo = idPeriodo;
        this.descripcion = descripcion;
        this.anioInicio = anioInicio;
        this.mesInicio = mesInicio;
        this.diaInicio = diaInicio;
        this.anioFin = anioFin;
        this.mesFin = mesFin;
        this.diaFin = diaFin;
        this.periodoActual = periodoActual;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(Integer anioInicio) {
        this.anioInicio = anioInicio;
    }

    public Integer getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(Integer mesInicio) {
        this.mesInicio = mesInicio;
    }

    public Integer getDiaInicio() {
        return diaInicio;
    }

    public void setDiaInicio(Integer diaInicio) {
        this.diaInicio = diaInicio;
    }

    public Integer getAnioFin() {
        return anioFin;
    }

    public void setAnioFin(Integer anioFin) {
        this.anioFin = anioFin;
    }

    public Integer getMesFin() {
        return mesFin;
    }

    public void setMesFin(Integer mesFin) {
        this.mesFin = mesFin;
    }

    public Integer getDiaFin() {
        return diaFin;
    }

    public void setDiaFin(Integer diaFin) {
        this.diaFin = diaFin;
    }

    public Boolean getPeriodoActual() {
        return periodoActual;
    }

    public void setPeriodoActual(Boolean periodoActual) {
        this.periodoActual = periodoActual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PeriodoDTO periodo = (PeriodoDTO) o;

        if (!idPeriodo.equals(periodo.idPeriodo)) return false;
        if (!descripcion.equals(periodo.descripcion)) return false;
        if (!anioInicio.equals(periodo.anioInicio)) return false;
        if (!mesInicio.equals(periodo.mesInicio)) return false;
        if (!diaInicio.equals(periodo.diaInicio)) return false;
        if (!anioFin.equals(periodo.anioFin)) return false;
        if (!mesFin.equals(periodo.mesFin)) return false;
        if (!diaFin.equals(periodo.diaFin)) return false;
        return periodoActual.equals(periodo.periodoActual);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idPeriodo.hashCode();
        result = 31 * result + descripcion.hashCode();
        result = 31 * result + anioInicio.hashCode();
        result = 31 * result + mesInicio.hashCode();
        result = 31 * result + diaInicio.hashCode();
        result = 31 * result + anioFin.hashCode();
        result = 31 * result + mesFin.hashCode();
        result = 31 * result + diaFin.hashCode();
        result = 31 * result + periodoActual.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PeriodoRequest{" +
                "idPeriodo=" + idPeriodo +
                ", descripcion='" + descripcion + '\'' +
                ", anioInicio=" + anioInicio +
                ", mesInicio=" + mesInicio +
                ", diaInicio=" + diaInicio +
                ", anioFin=" + anioFin +
                ", mesFin=" + mesFin +
                ", diaFin=" + diaFin +
                ", periodoActual=" + periodoActual +
                '}';
    }
}
