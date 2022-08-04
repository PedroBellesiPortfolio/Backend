
package com.portfolio.portfoliopedro.service;

import com.portfolio.portfoliopedro.model.Experiencia;
import java.util.List;



public interface Iexperienciaservice {
    
    public List<Experiencia> verExperiencia ();
    
    public void crearModificarExperiencia (Experiencia exp);
    
    public void borrarExperiencia (long idsex1);
    
}
