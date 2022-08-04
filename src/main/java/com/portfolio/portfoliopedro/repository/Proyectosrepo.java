
package com.portfolio.portfoliopedro.repository;

import com.portfolio.portfoliopedro.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Proyectosrepo extends JpaRepository <Proyectos, Long>{

    
    
}
