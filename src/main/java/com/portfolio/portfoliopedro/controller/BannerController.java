
package com.portfolio.portfoliopedro.controller;

import com.portfolio.portfoliopedro.model.Banner;
import com.portfolio.portfoliopedro.service.Bannerservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



    

@RestController
@RequestMapping("/api")
public class BannerController {
 
    @Autowired
    private Bannerservice barServi;
   
    @CrossOrigin(origins = 
{"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @PostMapping("/banner/mas")
    public void modificaunbanner (@RequestBody Banner ban){
    barServi.modificarBanner (ban);
    }
    
    @CrossOrigin(origins = 
{"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @PutMapping("/banner/edita")
    public void editaunbanner (@RequestBody Banner ban){
    barServi.modificarBanner (ban);
    }
    
    @CrossOrigin(origins = 
{"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @GetMapping("/banner/ver")  
    @ResponseBody
    public List<Banner> listapersona(){
    return barServi.verBanner();
    }
}