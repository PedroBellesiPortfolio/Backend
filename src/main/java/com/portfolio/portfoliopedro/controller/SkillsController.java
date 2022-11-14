
package com.portfolio.portfoliopedro.controller;


import com.portfolio.portfoliopedro.model.Skills;
import com.portfolio.portfoliopedro.repository.Skillsrepo;
import com.portfolio.portfoliopedro.service.Iskillservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
public class SkillsController {
    @Autowired
    private Iskillservice skServi;
    public Skillsrepo skrepo;
   
   
    @PostMapping("/skill/mas")
    public void agregask (@RequestBody Skills sk){
    skServi.crearModificarSkills(sk);
    }
    
   
    @PutMapping("/skill/edita/{ids1}")
    public ResponseEntity<Skills> editask (@PathVariable Long ids1,@RequestBody Skills sk){
        Skills updates = skrepo.findById(ids1).orElse(null);
        updates.setSkill(sk.getSkill());
        updates.setPorcentaje(sk.getPorcentaje());
        updates.setOrden_skill(sk.getOrden_skill());
        
    skServi.crearModificarSkills(updates);
    return ResponseEntity.ok(updates);
    }
    
    
    @GetMapping("/skill/ver")  
    @ResponseBody
    public List<Skills> listaexp(){
    return skServi.verSkills();
    }
    
    
    @DeleteMapping("/skill/borra/{idskills1}")  
    public void borrarunsk (@PathVariable Long idskills1){
    skServi.borrarSkills(idskills1);
    }
}
