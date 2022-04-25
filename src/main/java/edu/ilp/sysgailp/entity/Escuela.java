package edu.ilp.sysgailp.entity;

import javax.persistence.*;

@Entity
@Table(name = "escuela")
public class Escuela {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idescuela;

    @Column(name = "denominacion", length = 20)
    private  String denominacion;

    @Column(name = "codigo_escuela", length = 10)
    private  String codigoEscuela;

    //GETTERS AND SETTERS


    public Long getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCodigoEscuela() {
        return codigoEscuela;
    }

    public void setCodigoEscuela(String codigoEscuela) {
        this.codigoEscuela = codigoEscuela;
    }

    //CONSTRUCTORES

    public Escuela(Long idescuela, String denominacion, String codigoEscuela) {
        this.idescuela = idescuela;
        this.denominacion = denominacion;
        this.codigoEscuela = codigoEscuela;
    }
    //CONST VACIO

    public Escuela() {
    }
    //CONST

    public Escuela(Long idescuela) {
        this.idescuela = idescuela;
    }
}
