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

    public Docente(Long idpersona, String codigoDocente, String curso) {
        super(idpersona);
        this.codigoDocente = codigoDocente;
        this.curso = curso;
    }

    public Docente(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codigoDocente, String curso) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigoDocente = codigoDocente;
        this.curso = curso;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Column(name = "codigo_docente", length = 10,nullable = false)
    private String codigoDocente;

    @Column(name = "curso", length = 10)
    private String curso;

}
