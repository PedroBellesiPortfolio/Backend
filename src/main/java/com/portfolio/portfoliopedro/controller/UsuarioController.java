
package com.portfolio.portfoliopedro.controller;

import com.portfolio.portfoliopedro.model.Usuario;
import com.portfolio.portfoliopedro.repository.Usuariorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class UsuarioController {
 
    @Autowired
    private Usuariorepo usurep;
   
    
    @PostMapping("/usuario/mas")
    public void agregausuario (@RequestBody Usuario usu){
    usurep.save(usu);
    }
    
   
    }

