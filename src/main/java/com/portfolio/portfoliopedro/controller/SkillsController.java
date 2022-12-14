
package com.portfolio.portfoliopedro.controller;


import com.portfolio.portfoliopedro.model.Skills;
import com.portfolio.portfoliopedro.repository.Skillsrepo;
import com.portfolio.portfoliopedro.service.Iskillservice;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins ={"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
public class SkillsController {
    @Autowired
    public Skillsrepo skrepo;
    
    @Autowired
    private Iskillservice skServi;
    
   
   
    @PostMapping("/skill/mas")
    public void agregask (@RequestBody Skills sk){
    skServi.crearModificarSkills(sk);
    }
    
   
    @PutMapping("/skill/edita/{idskills1}")
   // public Skills editask (@PathVariable("id") Long id,@RequestParam ("skill") String nuevoskill) {
     public ResponseEntity<Skills> editask (@PathVariable Long idskills1,@RequestBody Skills nuevoskill) {
         
     Optional<Skills> upita= skrepo.findById(idskills1);
    
   //    updates.setSkill(nuevoskill.getSkill());
   //    updates.setPorcentaje(nuevoskill.getPorcentaje());
       
   //  .save(updates);  
   // skServi.crearModificarSkills(updates);
   //return upita;
   if (upita.isPresent()) {
      
      return new ResponseEntity<>(skrepo.save(nuevoskill), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
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
