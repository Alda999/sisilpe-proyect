package edu.ilp.sysgailp.service.impl;

import edu.ilp.sysgailp.dao.IEstudianteDao;
import edu.ilp.sysgailp.entity.Escuela;
import edu.ilp.sysgailp.entity.Estudiante;
import edu.ilp.sysgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return this.estudianteDao.save(estudiante);
    }

    @Override
    public List<Estudiante> listaEstudiantes(Escuela idescuela) {
        return this.estudianteDao.findByEscuela(idescuela);

    }

    @Override
    public Page<Estudiante> listaEstudianteByPagina(Pageable pageable, Escuela idescuela) {
        return this.estudianteDao.listaEstudiantes(pageable,idescuela);
    }

    @Override
    public void eliminarEstudiante(Long idestudiante) {
        this.estudianteDao.deleteById(idestudiante);
    }

    @Override
    public Estudiante obtenerEstudiante(String coddni) {
        return this.estudianteDao.obtenerEstudiante(coddni);
    }

    @Override
    public List<Estudiante> listarEstudianteApeNom(String apenom) {
        return this.estudianteDao.listarEstudiantesByAppNombre(apenom);
    }


}
