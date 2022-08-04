
package com.portfolio.portfoliopedro.controller;

import com.portfolio.portfoliopedro.model.Experiencia;
import com.portfolio.portfoliopedro.service.Iexperienciaservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExperienciaController {
    
    @Autowired
    private Iexperienciaservice expServi;
   
    @CrossOrigin(origins = "*")
    @PostMapping("/experiencia/mas")
    public void agregaexp (@RequestBody Experiencia exp){
    expServi.crearModificarExperiencia(exp);
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/experiencia/ver")  
    @ResponseBody
    public List<Experiencia> listaexp(){
    return expServi.verExperiencia();
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/experiencia/borra/{idsex1}")  
    public void borrarunaexp (@PathVariable Long idsex1){
    expServi.borrarExperiencia(idsex1);
    }
    
    
    
}
