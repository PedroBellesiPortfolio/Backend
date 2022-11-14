
package com.portfolio.portfoliopedro.controller;


import com.portfolio.portfoliopedro.model.Redes_sociales;
import com.portfolio.portfoliopedro.repository.Redes_socialesrepo;
import com.portfolio.portfoliopedro.service.redes_socialesservice;
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
public class Red_SocialController {
    
    @Autowired
    private redes_socialesservice redServi;
    public Redes_socialesrepo redrepo;
   
  
    public void modificaunared (@RequestBody Redes_sociales red){
    redServi.crearModificarRedSocial (red);
    }
    
   
    @PutMapping("/redsocial/edita/{idr1}")
    public Redes_sociales editaunared (@PathVariable Long idp1,@RequestBody Redes_sociales red){
        Redes_sociales updater = redrepo.findById(idp1).orElse(null);
        updater.setRed(red.getRed());
        updater.setLogo_red(red.getLogo_red());
        updater.setLink_red(red.getLink_red());
        updater.setUsuariore(red.getUsuariore());
    redServi.crearModificarRedSocial (updater);
    return updater;
    }
    
   
    @GetMapping("/redsocial/ver")  
    @ResponseBody
    public List<Redes_sociales> listared(){
    return redServi.verRedSocial();
    }
    
    @CrossOrigin(origins = {"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @DeleteMapping("/redsocial/borra")  
    public void borrarunred (@RequestBody Redes_sociales red){
    redServi.borrarRedSocial(red);
    }
}
