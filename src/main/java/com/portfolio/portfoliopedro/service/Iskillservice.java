
package com.portfolio.portfoliopedro.service;

import com.portfolio.portfoliopedro.model.Skills;
import java.util.List;



public interface Iskillservice {
    
    public List<Skills> verSkills ();
    
    public void crearModificarSkills (Skills sk);
    
    public void borrarSkills (Long idskills1);
    
    
}
