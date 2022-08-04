
package com.portfolio.portfoliopedro.repository;

import com.portfolio.portfoliopedro.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Personarepo extends JpaRepository <Persona, Long>{

    
    
}
