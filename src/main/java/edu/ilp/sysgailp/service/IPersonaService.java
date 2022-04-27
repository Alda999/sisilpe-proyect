package edu.ilp.sysgailp.service;

import edu.ilp.sysgailp.entity.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonaService {

    //LISTA PERSONA
    List<Persona> listarPersonas();

    //PERSONA ATRAVEZ DE DNI
    Persona obtenerPersonaPorDni(String dni);
}
