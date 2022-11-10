
package com.portfolio.portfoliopedro.controller;


import com.portfolio.portfoliopedro.model.Skills;
import com.portfolio.portfoliopedro.service.Iskillservice;
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
public class SkillsController {
    @Autowired
    private Iskillservice skServi;
   
    @CrossOrigin(origins = {"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @PostMapping("/skill/mas")
    public void agregask (@RequestBody Skills sk){
    skServi.crearModificarSkills(sk);
    }
    
    @CrossOrigin(origins = {"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @PutMapping("/skill/edita")
    public void editask (@RequestBody Skills sk){
    skServi.crearModificarSkills(sk);
    }
    
    @CrossOrigin(origins = {"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @GetMapping("/skill/ver")  
    @ResponseBody
    public List<Skills> listaexp(){
    return skServi.verSkills();
    }
    
    @CrossOrigin(origins = {"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @DeleteMapping("/skill/borra/{idskills1}")  
    public void borrarunsk (@PathVariable Long idskills1){
    skServi.borrarSkills(idskills1);
    }
}
