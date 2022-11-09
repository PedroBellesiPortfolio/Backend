
package com.portfolio.portfoliopedro.controller;


import com.portfolio.portfoliopedro.model.Persona;
import com.portfolio.portfoliopedro.service.Ipersonaservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonaController {
 
    @Autowired
    private Ipersonaservice perServi;
   
    @CrossOrigin(origins = "*")
    @PostMapping("/persona/mas")
    public void agregarpersona (@RequestBody Persona per){
    perServi.crearModificarPersona(per);
    }
    
    @CrossOrigin(origins = "*")
    @PutMapping("/persona/edita")
    public void editapersona (@RequestBody Persona per){
    perServi.crearModificarPersona(per);
    }
    
   // @CrossOrigin(origins = "http://localhost:4200")
    @CrossOrigin(origins = "*")
    @GetMapping("/persona/ver")  
    @ResponseBody
    public List<Persona> listapersona(){
    return perServi.verPersona();
    }
    
    @DeleteMapping("/persona/borra")  
    public void borrarunapersona (@RequestBody Persona per){
    perServi.borrarPersona(per);
    }
   
    
}
