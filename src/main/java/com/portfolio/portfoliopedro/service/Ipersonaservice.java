
package com.portfolio.portfoliopedro.service;

import com.portfolio.portfoliopedro.model.Persona;
import java.util.List;



public interface Ipersonaservice {
    
    public List<Persona> verPersona ();
    
    public Persona crearModificarPersona (Persona per);
    
    public void borrarPersona(Persona per);
}
