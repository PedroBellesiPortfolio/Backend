
package com.portfolio.portfoliopedro.service;
import com.portfolio.portfoliopedro.model.Educacion;
import java.util.List;



public interface Ieducacionservice {
    
    public List<Educacion> verEducacion ();
    
    public Educacion crearModificarEducacion (Educacion edu);
    
   public void borrarEducacion (long idsedu1);
    
       
    
}
