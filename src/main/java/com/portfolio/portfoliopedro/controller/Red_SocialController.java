
package com.portfolio.portfoliopedro.controller;


import com.portfolio.portfoliopedro.model.Redes_sociales;
import com.portfolio.portfoliopedro.service.redes_socialesservice;
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
public class Red_SocialController {
    
    @Autowired
    private redes_socialesservice redServi;
   
    @CrossOrigin(origins = "*")
    @PostMapping("/redsocial/mas")
    public void modificaunared (@RequestBody Redes_sociales red){
    redServi.crearModificarRedSocial (red);
    }
    
    @CrossOrigin(origins = "*")
    @PutMapping("/redsocial/edita")
    public void editaunared (@RequestBody Redes_sociales red){
    redServi.crearModificarRedSocial (red);
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/redsocial/ver")  
    @ResponseBody
    public List<Redes_sociales> listared(){
    return redServi.verRedSocial();
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/redsocial/borra")  
    public void borrarunred (@RequestBody Redes_sociales red){
    redServi.borrarRedSocial(red);
    }
}
