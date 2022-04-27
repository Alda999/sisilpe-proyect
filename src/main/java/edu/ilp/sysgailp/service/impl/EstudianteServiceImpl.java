package edu.ilp.sysgailp.service.impl;

import edu.ilp.sysgailp.dao.IEstudianteDao;
import edu.ilp.sysgailp.entity.Estudiante;
import edu.ilp.sysgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listarEstudiante() {
        return this.estudianteDao.findAll();
    }

    @Override
    public Estudiante obtenerEstudiantePorCodigo(String codigo) {
        return this.estudianteDao.findByCodigo(codigo);
    }
}
