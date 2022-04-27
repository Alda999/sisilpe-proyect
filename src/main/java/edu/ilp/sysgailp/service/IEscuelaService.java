package edu.ilp.sysgailp.service;

import edu.ilp.sysgailp.entity.Escuela;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEscuelaService {

    //Listar Escuelas
    List<Escuela> listarEscuelas();

    //OBTENER ESCUELA POR SU CODIGO
    Escuela obtenerEscuelaPorCodigo(String codigo);


    //BUSCAR UNA ESCUELA ATRAVEZ DE SU ID Y DENOMINACION

    Escuela buscarEscuelaByIdAndDenominacion(Long idescuela, String denominacion);
}
