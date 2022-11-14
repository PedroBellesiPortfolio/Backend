
package com.portfolio.portfoliopedro.controller;


import com.portfolio.portfoliopedro.model.Persona;
import com.portfolio.portfoliopedro.repository.Personarepo;
import com.portfolio.portfoliopedro.service.Ipersonaservice;
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
@CrossOrigin(origins = {"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
public class PersonaController {
 
    @Autowired
    private Ipersonaservice perServi;
    public Personarepo persoRepo;
   
   
   
    
    @PostMapping("/persona/mas")
    public void agregarpersona (@RequestBody Persona per){
    perServi.crearModificarPersona(per);
    }
    
    
    @PutMapping("/persona/edita/{idpe1}")
    public Persona editapersona (@PathVariable Long idpe1,@RequestBody Persona per){
        Persona updateper = persoRepo.findById(idpe1).orElse(null);
        updateper.setNombre(per.getNombre());
        updateper.setApellido(per.getNombre());
        updateper.setFecha_nacimiento(per.getFecha_nacimiento());
        updateper.setCiudad(per.getCiudad());
        updateper.setProvincia(per.getProvincia());
        updateper.setPais(per.getPais());
        updateper.setTelefono(per.getTelefono());
        updateper.setEmail(per.getEmail());
        updateper.setUsuarioclave(per.getUsuarioclave());
        updateper.setClave(per.getClave());
        updateper.setUsuariope(per.getUsuariope());
    perServi.crearModificarPersona(updateper);
    return updateper;
    }
    
  
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
