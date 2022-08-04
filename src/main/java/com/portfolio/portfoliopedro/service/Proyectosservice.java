
package com.portfolio.portfoliopedro.service;

import com.portfolio.portfoliopedro.model.Proyectos;
import com.portfolio.portfoliopedro.repository.Proyectosrepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//
public class Proyectosservice implements Iproyectosservice{
    
    @Autowired
    public Proyectosrepo proyerepo;
    
    @Override
    public List<Proyectos> verProyectos() {
    return proyerepo.findAll();
    }

    @Override
    public void crearModificarProyectos(Proyectos pro) {
    proyerepo.save(pro);
    }

    @Override
    public void borrarProyectos(long idspro1) {
    proyerepo.deleteById(idspro1);
    }
    
}
