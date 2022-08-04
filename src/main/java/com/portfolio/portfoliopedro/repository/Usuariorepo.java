
package com.portfolio.portfoliopedro.repository;

import com.portfolio.portfoliopedro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


 
    
@Repository
public interface Usuariorepo extends JpaRepository <Usuario, Long>{

    }
