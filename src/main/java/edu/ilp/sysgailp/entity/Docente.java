package edu.ilp.sysgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Docente extends Persona {



    @Column(name = "codigo_docente", length = 10,nullable = false)
    private String codigoDocente;

    @Column(name = "horas_asignadas", length = 20)
    private Double horasAsignadas;

    //getters and setters


    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public Double getHorasAsignadas() {
        return horasAsignadas;
    }

    public void setHorasAsignadas(Double horasAsignadas) {
        this.horasAsignadas = horasAsignadas;
    }

    //CONTRUCTORES


    public Docente(String codigoDocente, Double horasAsignadas) {
        this.codigoDocente = codigoDocente;
        this.horasAsignadas = horasAsignadas;
    }

    public Docente(Long idpersona, String codigoDocente, Double horasAsignadas) {
        super(idpersona);
        this.codigoDocente = codigoDocente;
        this.horasAsignadas = horasAsignadas;
    }

    public Docente(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codigoDocente, Double horasAsignadas) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigoDocente = codigoDocente;
        this.horasAsignadas = horasAsignadas;
    }

    //CONSTRUCTOR VACIO

    public Docente() {
    }

    public Docente(Long idpersona) {
        super(idpersona);
    }

    public Docente(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
    }
}
