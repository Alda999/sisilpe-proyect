package edu.ilp.sysgailp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ilp.sysgailp.entity.Escuela;
import edu.ilp.sysgailp.entity.Estudiante;
import edu.ilp.sysgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estudiante")
//navegacion
public class EstudianteController {
    //@GetMapping - solicitar algo de la base de datos, listar, buscar obj
    //@PostMapping - guardar,modificar, eliminar.

    @Autowired
    private IEstudianteService estudianteService;

    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping("/registrar")
    public String registrarEstudiante(@RequestBody String jsonEstudiante) throws JsonProcessingException {

        Estudiante estudiante = this.objectMapper.readValue(jsonEstudiante, Estudiante.class);

        this.estudianteService.guardarEstudiante(estudiante);
        return "El esudiante se registro conrrectamente";
    }
    @GetMapping("/lista")
    public List<Estudiante> listaEstudiantes(@RequestParam Escuela idescuela){
        return this.estudianteService.listaEstudiantes(idescuela);
    }

    @GetMapping("/listaPage")
    public Page<Estudiante> listaEstudiantesPage(@RequestParam Escuela idescuela, @RequestParam int pagina){

        Pageable page = PageRequest.of(pagina,2);

        return this.estudianteService.listaEstudianteByPagina(page,idescuela);
    }


    @PostMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable Long id){
        this.estudianteService.eliminarEstudiante(id);
        return "REGISTRO DE ESTUDIANTE ELIMINADO CORRECTAMENTE";
    }

    @GetMapping("/buscar/{coddni}")
    public Estudiante buscarEstudiante(@PathVariable String coddni){
        return this.estudianteService.obtenerEstudiante(coddni);
    }

    @GetMapping("/listarByAppNombre/{appnombre}")
    public List<Estudiante> listarEstudianteApeNom(@PathVariable String appnombre){
        return this.estudianteService.listarEstudianteApeNom(appnombre);
    }

    @PutMapping("/actualizar")
    public String actualizarEstudiante(@RequestBody String jsonEstudiante) throws JsonProcessingException {

        Estudiante estudiante = this.objectMapper.readValue(jsonEstudiante, Estudiante.class);
        this.estudianteService.guardarEstudiante(estudiante);

        return "Datos del estudiante se actualizó correctamente";
    }




}
