
package com.portfolio.portfoliopedro.controller;


import com.portfolio.portfoliopedro.model.Usuario;
import com.portfolio.portfoliopedro.repository.Usuariorepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class UsuarioController {
 
    @Autowired
    private Usuariorepo usurep;
    
    @CrossOrigin(origins = {"http//localhost:4200","https://portfoliopedrobellesi.web.app","https://portfoliopedrobellesi.firebaseapp.com"})
    @GetMapping("/usuario/ver")  
    @ResponseBody
    public List<Usuario> listausuario(){
     List<Usuario> listausuario = usurep.findAll();
    return  listausuario;    
    
    }
   
    
    @PostMapping("/usuario/mas")
    public void agregausuario (@RequestBody Usuario usu){
    usurep.save(usu);
    }
    
   
    }

