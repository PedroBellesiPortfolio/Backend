
package com.portfolio.portfoliopedro.repository;


import com.portfolio.portfoliopedro.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Skillsrepo extends JpaRepository <Skills, Long>{

  


    
}
