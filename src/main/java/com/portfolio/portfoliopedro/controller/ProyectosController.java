
package com.portfolio.portfoliopedro.controller;


import com.portfolio.portfoliopedro.model.Proyectos;
import com.portfolio.portfoliopedro.repository.Proyectosrepo;
import com.portfolio.portfoliopedro.service.Iproyectosservice;
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
public class ProyectosController {
      @Autowired
    private Iproyectosservice proServi;
    public Proyectosrepo proyerepo;
   
  
    @PostMapping("/proyectos/mas")
    public void agregapro (@RequestBody Proyectos exp){
    proServi.crearModificarProyectos(exp);
    }
    
  
    @PutMapping("/proyectos/edita/{idp1}")
    public Proyectos editapro (@PathVariable Long idp1,@RequestBody Proyectos exp){
        Proyectos updatepr = proyerepo.findById(idp1).orElse(null);
        updatepr.setTitulo_proyecto(exp.getTitulo_proyecto());
        updatepr.setLink_proyecto(exp.getLink_proyecto());
        updatepr.setFoto_proyecto(exp.getFoto_proyecto());
        updatepr.setDescripcion_proyecto(exp.getDescripcion_proyecto());
        updatepr.setTecnologias(exp.getTecnologias());
        updatepr.setYear_proyecto(exp.getYear_proyecto());
        updatepr.setOrden_proyectos(exp.getOrden_proyectos());
        
    proServi.crearModificarProyectos(updatepr);
    return updatepr;
    }
    
   
    @GetMapping("/proyectos/ver")  
    @ResponseBody
    public List<Proyectos> listapro(){
    return proServi.verProyectos();
    }
    
  
    @DeleteMapping("/proyectos/borra/{idspro1}")  
    public void borrarunpro (@PathVariable Long idspro1){
    proServi.borrarProyectos(idspro1);
    }
}
