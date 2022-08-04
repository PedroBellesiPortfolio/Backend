
package com.portfolio.portfoliopedro.service;

import com.portfolio.portfoliopedro.model.Redes_sociales;
import java.util.List;



public interface Iredes_socialesservice {
    
    public List<Redes_sociales> verRedSocial ();
    
    public void crearModificarRedSocial (Redes_sociales red);
    
    public void borrarRedSocial (Redes_sociales red);
    
    
}
