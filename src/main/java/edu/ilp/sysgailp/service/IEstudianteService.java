package edu.ilp.sysgailp.service;

import edu.ilp.sysgailp.entity.Escuela;
import edu.ilp.sysgailp.entity.Estudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEstudianteService {

    //Este método registra un estudiante
    Estudiante guardarEstudiante(Estudiante estudiante);

    //Lista de estudiantes por escuela
    List<Estudiante> listaEstudiantes(Escuela idescuela);

    //Lista estudiantes por escuela y por páginas
    Page<Estudiante> listaEstudianteByPagina(Pageable pageable, Escuela idescuela);

    //Eliminar un Estudiante de la base de datos
    void eliminarEstudiante(Long idestudiante);

    //Obtener estudiante a travez de su codigo o dni
    Estudiante obtenerEstudiante(String coddni);

    //Obtener estudiante mediante nombre o apellido
    List<Estudiante> listarEstudianteApeNom(String apenom);



}
