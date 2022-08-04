
package com.portfolio.portfoliopedro.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.portfoliopedro.model.Persona;
import com.portfolio.portfoliopedro.repository.Personarepo;




@Service
public class Personaservice implements Ipersonaservice{

    @Autowired
    public Personarepo persoRepo;
    
    @Override
     public List<Persona> verPersona() {
        List<Persona> listapersonas = persoRepo.findAll();
       return  listapersonas;
    }

    @Override
    public Persona crearModificarPersona(Persona per) {
        return persoRepo.save(per);
    }
   
    @Override 
    public void borrarPersona(Persona per) {
    persoRepo.delete(per);
  }

   
    
}
