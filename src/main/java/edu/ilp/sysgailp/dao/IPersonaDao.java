package edu.ilp.sysgailp.dao;

import edu.ilp.sysgailp.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Long> {

    //RETORNAR PERSONA POR DNI:
    Persona findByDni(String dni);
}
