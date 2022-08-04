
package com.portfolio.portfoliopedro.service;

import com.portfolio.portfoliopedro.model.Educacion;
import com.portfolio.portfoliopedro.repository.Educacionrepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Educacionservice implements Ieducacionservice{

   @Autowired
   public Educacionrepo edurepo;
    
   @Override
   public List<Educacion> verEducacion() {
      List<Educacion> listaeduca = edurepo.findAll();
       return  listaeduca;
    }

    @Override
   public Educacion crearModificarEducacion(Educacion edu) {
   return edurepo.save(edu);
   }

   @Override
   public void borrarEducacion(long idsedu1) {
   edurepo.deleteById(idsedu1);
  }
    
}
