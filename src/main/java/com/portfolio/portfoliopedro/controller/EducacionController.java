
package com.portfolio.portfoliopedro.controller;

import com.portfolio.portfoliopedro.model.Educacion;
import com.portfolio.portfoliopedro.repository.Educacionrepo;
import com.portfolio.portfoliopedro.service.Ieducacionservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins ={"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
public class EducacionController {
    
    @Autowired
    private Ieducacionservice eduServi;
    @Autowired
    public Educacionrepo edurepo;
   
 
    @PostMapping("/educacion/mas")
    public void agregareducacion (@RequestBody Educacion edu){
    eduServi.crearModificarEducacion(edu);
    }
    
 
    @PutMapping("/educacion/edita/{idedu1}")
    public Educacion editaeducacion (@PathVariable Long idedu1,@RequestBody Educacion edudetalle ){
        Educacion updateedu = edurepo.findById(idedu1).orElse(null);
        updateedu.setInstitucion(edudetalle.getInstitucion());
        updateedu.setTitulo(edudetalle.getTitulo());
        updateedu.setLogo_institucion(edudetalle.getLogo_institucion());
        updateedu.setCompletado(edudetalle.getCompletado());
        updateedu.setFecha_finalizacion_titulo(edudetalle.getFecha_finalizacion_titulo());
        updateedu.setOrden_titulo(edudetalle.getOrden_titulo());
        
    eduServi.crearModificarEducacion(updateedu);
    return updateedu;
    }
    
 
    @GetMapping("/educacion/ver")  
    @ResponseBody
    public List<Educacion> listaeducacion(){
    return eduServi.verEducacion();
    }
    
 
    @DeleteMapping("/educacion/borra/{idsedu1}")  
    public void borrarunaeducacion (@PathVariable Long idsedu1){
    eduServi.borrarEducacion(idsedu1);
    }
   
}
