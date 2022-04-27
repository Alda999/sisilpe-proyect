package edu.ilp.sysgailp.dao;

import edu.ilp.sysgailp.entity.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEscuelaDao extends JpaRepository<Escuela,Long> {


    //OBTIENE UNA ESCUELA ATRAVEZ DE SU CODIGO
    Escuela findByCodigoEscuela(String codigo);

   @Query("SELECT e FROM Escuela e WHERE e.codigoEscuela = ?1")
    Escuela obtenerEscuelaPorCodigo(String codigo);

    @Query("SELECT e FROM Escuela e WHERE e.codigoEscuela = :codigo")
    Escuela obtenerEscuelaPorParam(@Param("codigo") String codigo);

    //OBTIENE UNA ESCUELA ATRAVEZ DE SU ID Y DENOMINACION

    Escuela findByIdescuelaAndDenominacion(Long idescuela, String denomincion);


}
