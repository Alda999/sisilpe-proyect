package edu.ilp.sysgailp.controller;

import edu.ilp.sysgailp.entity.Escuela;
import edu.ilp.sysgailp.entity.Estudiante;
import edu.ilp.sysgailp.entity.Persona;
import edu.ilp.sysgailp.service.IEscuelaService;
import edu.ilp.sysgailp.service.IEstudianteService;
import edu.ilp.sysgailp.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class PruebaController {

    @Autowired
    private IEscuelaService escuelaService;

    @GetMapping("/listaEscuelas")
    public List<Escuela> listaEscuelas(){
        return this.escuelaService.listarEscuelas();
    }

    @GetMapping("/buscarEscuelaByCodigo")
    public Escuela buscarEscuelaByCodigo(@RequestParam String codigo){
        return this.escuelaService.obtenerEscuelaPorCodigo(codigo);
    }

    //buscar por id-denominacion

    @GetMapping("/buscarEscuelaByIdAndDenominacion")
    public Escuela buscarEscuelaByIdAndDenominacion(@RequestParam Long idescuela, @RequestParam String nombre){
        return this.escuelaService.buscarEscuelaByIdAndDenominacion(idescuela, nombre);
    }

    //LISTA PERSONAS
    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listaPersonas")
    public List<Persona> listaPersonas(){
        return this.personaService.listarPersonas();
    }

    //PERSONA POR DNI:
    @GetMapping("/retornarPersonaPorDni")
    public Persona retornarPersonaPorDni(@RequestParam String dni){
        return this.personaService.obtenerPersonaPorDni(dni);
    }

    //LISTAR ESTUDIANTE
    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping("/listaEstudiantes")
    public List<Estudiante> listaEstudiantes(){
        return this.estudianteService.listarEstudiante();
    }

    //ESTUDIANTE POR CODIGO:
    @GetMapping("/buscarEstudianteByCodigo")
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo){
        return this.estudianteService.obtenerEstudiantePorCodigo(codigo);
    }







    @GetMapping("/saludo")
    public String saludo()
    {
        return "Hola amigos - Desde Ayacucho";
    }
    @GetMapping("/bienvenido")
    public String identificacion(@RequestParam String datos)
    {
        return "Bienvenido a la Pontificia: "+ datos;
    }
}
