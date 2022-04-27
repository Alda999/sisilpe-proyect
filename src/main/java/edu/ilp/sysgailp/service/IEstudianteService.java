package edu.ilp.sysgailp.service;

import edu.ilp.sysgailp.entity.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEstudianteService {

    //lISTAR PERSONA
    List<Estudiante> listarEstudiante();

    //PERSONA POR CODIGO
    Estudiante obtenerEstudiantePorCodigo(String codigo);
}
