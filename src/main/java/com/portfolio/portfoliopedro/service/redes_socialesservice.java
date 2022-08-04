
package com.portfolio.portfoliopedro.service;

import com.portfolio.portfoliopedro.model.Redes_sociales;
import com.portfolio.portfoliopedro.repository.Redes_socialesrepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class redes_socialesservice implements Iredes_socialesservice{

    @Autowired
    public Redes_socialesrepo redrepo;
    
    @Override
    public List<Redes_sociales> verRedSocial() {
        return redrepo.findAll();
    }

    @Override
    public void crearModificarRedSocial(Redes_sociales red) {
    redrepo.save(red);
    }

    @Override
    public void borrarRedSocial(Redes_sociales red) {
    redrepo.delete(red);
        
    }
    
}
