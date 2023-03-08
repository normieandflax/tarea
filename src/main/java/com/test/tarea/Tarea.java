package com.test.tarea;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tarea")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private Date fecha_creacion;

    private Boolean vigente;

    public Tarea() {}

    public Tarea(String descripcion, Date fecha_creacion, Boolean vigente) {
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.vigente = vigente;
    }

    public Long getIdentificador() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fecha_creacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fecha_creacion = fechaCreacion;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }
}
