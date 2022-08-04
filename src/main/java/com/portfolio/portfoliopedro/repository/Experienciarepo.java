
package com.portfolio.portfoliopedro.repository;

import com.portfolio.portfoliopedro.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Experienciarepo extends JpaRepository <Experiencia, Long>{

  
    
}
