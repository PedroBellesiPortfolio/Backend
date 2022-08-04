
package com.portfolio.portfoliopedro.service;

import com.portfolio.portfoliopedro.model.Skills;
import com.portfolio.portfoliopedro.repository.Skillsrepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Skillservice implements Iskillservice{

    @Autowired
    public Skillsrepo skrepo;
    
    @Override
    public List<Skills> verSkills() {
       return skrepo.findAll();
    }

    @Override
    public void crearModificarSkills(Skills sk) {
        skrepo.save(sk);
    }

    @Override
    public void borrarSkills(Long idskills1) {
    skrepo.deleteById(idskills1);
    }
    
}
