package edu.ilp.sysgailp.service.impl;

import edu.ilp.sysgailp.dao.IPersonaDao;
import edu.ilp.sysgailp.entity.Persona;
import edu.ilp.sysgailp.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersonas() {
        return this.personaDao.findAll();
    }

    @Override
    public Persona obtenerPersonaPorDni(String dni) {
        return this.personaDao.findByDni(dni);
    }
}
