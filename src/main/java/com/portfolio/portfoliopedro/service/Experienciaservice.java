
package com.portfolio.portfoliopedro.service;

import com.portfolio.portfoliopedro.model.Experiencia;
import com.portfolio.portfoliopedro.repository.Experienciarepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Experienciaservice implements Iexperienciaservice{

    @Autowired
    public Experienciarepo exprepo;
    
   @Override
   public List<Experiencia> verExperiencia() {
    return exprepo.findAll();
   }

   @Override
   public void crearModificarExperiencia(Experiencia exp) {
   exprepo.save(exp);
   }

   @Override
   public void borrarExperiencia(long idsex1) {
   exprepo.deleteById(idsex1);
   }
    
}
