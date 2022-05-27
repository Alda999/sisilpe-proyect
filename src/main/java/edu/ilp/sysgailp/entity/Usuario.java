package edu.ilp.sysgailp.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idusuario;

    @Column(name = "username", nullable = false,length = 50)
    private String username;

    @Column(name = "password", nullable = false,length = 50)
    private String password;

    @OneToOne
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
    private  Persona persona;

    @ManyToMany
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "idusuario"),
            inverseJoinColumns = @JoinColumn(name = "idrol"))
    private Set<Rol> roles = new HashSet<>();

    //gttrs sttrs

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
    //CONSTRUCTOR

    public Usuario(Long idusuario, String username, String password, Persona persona, Set<Rol> roles) {
        this.idusuario = idusuario;
        this.username = username;
        this.password = password;
        this.persona = persona;
        this.roles = roles;
    }

    //CONST

    public Usuario() {
    }

    public Usuario(String username, String password, Persona persona) {
        this.username = username;
        this.password = password;
        this.persona = persona;
    }

    //CONST2

    public Usuario(Long idusuario) {
        this.idusuario = idusuario;
    }
}
