
package com.portfolio.portfoliopedro.controller;

import com.portfolio.portfoliopedro.model.Experiencia;
import com.portfolio.portfoliopedro.repository.Experienciarepo;
import com.portfolio.portfoliopedro.service.Iexperienciaservice;
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
public class ExperienciaController {
    
    @Autowired
    private Iexperienciaservice expServi;
    public Experienciarepo exprepo;
   
 
    @PostMapping("/experiencia/mas")
    public void agregaexp (@RequestBody Experiencia exp){
    expServi.crearModificarExperiencia(exp);
    }
    
  
    @PutMapping("/experiencia/edita{idexp1}")
    public Experiencia editaexp (@PathVariable Long idexp1,@RequestBody Experiencia exp){
        Experiencia updateexp = exprepo.findById(idexp1).orElse(null);
        updateexp.setTitulo_puesto(exp.getTitulo_puesto());
        updateexp.setEmpresa(exp.getEmpresa());
        updateexp.setLogo_empresa(exp.getLogo_empresa());
        updateexp.setDescripcion_tareas(exp.getDescripcion_tareas());
        updateexp.setYear_inicio(exp.getYear_inicio());
        updateexp.setYear_cierre(exp.getYear_cierre());
        updateexp.setOrden_experiencia(exp.getOrden_experiencia());
        updateexp.setUsuarioex(exp.getUsuarioex());
    expServi.crearModificarExperiencia(updateexp);
    return updateexp;
    }
    
  
    @GetMapping("/experiencia/ver")  
    @ResponseBody
    public List<Experiencia> listaexp(){
    return expServi.verExperiencia();
    }
    
   
    @DeleteMapping("/experiencia/borra/{idsex1}")  
    public void borrarunaexp (@PathVariable Long idsex1){
    expServi.borrarExperiencia(idsex1);
    }
    
    
    
}
