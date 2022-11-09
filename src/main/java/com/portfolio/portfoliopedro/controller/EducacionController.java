
package com.portfolio.portfoliopedro.controller;

import com.portfolio.portfoliopedro.model.Educacion;
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
public class EducacionController {
    
    @Autowired
    private Ieducacionservice eduServi;
   
    @CrossOrigin(origins = "*")
    @PostMapping("/educacion/mas")
    public void agregareducacion (@RequestBody Educacion edu){
    eduServi.crearModificarEducacion(edu);
    }
    
    @CrossOrigin(origins = "*")
    @PutMapping("/educacion/edita")
    public void editaeducacion (@RequestBody Educacion edu){
    eduServi.crearModificarEducacion(edu);
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/educacion/ver")  
    @ResponseBody
    public List<Educacion> listaeducacion(){
    return eduServi.verEducacion();
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/educacion/borra/{idsedu1}")  
    public void borrarunaeducacion (@PathVariable Long idsedu1){
    eduServi.borrarEducacion(idsedu1);
    }
   
}
