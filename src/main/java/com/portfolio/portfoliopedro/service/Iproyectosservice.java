
package com.portfolio.portfoliopedro.service;

import com.portfolio.portfoliopedro.model.Proyectos;
import java.util.List;



public interface Iproyectosservice {
    
    
    public List<Proyectos> verProyectos();
    
    public void crearModificarProyectos(Proyectos pro);
    
    public void borrarProyectos(long idspro1);

}