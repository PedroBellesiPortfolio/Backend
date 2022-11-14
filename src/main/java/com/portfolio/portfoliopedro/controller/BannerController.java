
package com.portfolio.portfoliopedro.controller;

import com.portfolio.portfoliopedro.model.Banner;
import com.portfolio.portfoliopedro.repository.Bannerrepo;
import com.portfolio.portfoliopedro.service.Bannerservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
public class BannerController {
 
    @Autowired
    private Bannerservice barServi;
    public Bannerrepo banrepo;
   

    @PostMapping("/banner/mas")
    public void modificaunbanner (@RequestBody Banner ban){
    barServi.modificarBanner (ban);
    }
    

    @PutMapping("/banner/edita/{idba1}")
    public Banner editaunbanner (@PathVariable Long idba1,@RequestBody Banner ban){
        Banner updatebanner = banrepo.findById(idba1).orElse(null);
        updatebanner.setFoto_fondo(ban.getFoto_fondo());
        updatebanner.setFoto_entidad(ban.getFoto_entidad());
        updatebanner.setExperiencia_resumen(ban.getExperiencia_resumen());
        updatebanner.setUsuarioba(ban.getUsuarioba());
        return updatebanner;
    }
        

    @GetMapping("/banner/ver")  
    @ResponseBody
    public List<Banner> listapersona(){
    return barServi.verBanner();
    }
}