
package com.portfolio.portfoliopedro.controller;


import com.portfolio.portfoliopedro.model.Proyectos;
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
public class ProyectosController {
      @Autowired
    private Iproyectosservice proServi;
   
    @CrossOrigin(origins = {"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @PostMapping("/proyectos/mas")
    public void agregapro (@RequestBody Proyectos exp){
    proServi.crearModificarProyectos(exp);
    }
    
    @CrossOrigin(origins = {"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @PutMapping("/proyectos/edita")
    public void editapro (@RequestBody Proyectos exp){
    proServi.crearModificarProyectos(exp);
    }
    
    @CrossOrigin(origins = {"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @GetMapping("/proyectos/ver")  
    @ResponseBody
    public List<Proyectos> listapro(){
    return proServi.verProyectos();
    }
    
    @CrossOrigin(origins = {"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @DeleteMapping("/proyectos/borra/{idspro1}")  
    public void borrarunpro (@PathVariable Long idspro1){
    proServi.borrarProyectos(idspro1);
    }
}
