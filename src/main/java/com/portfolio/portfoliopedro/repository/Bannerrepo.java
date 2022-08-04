
package com.portfolio.portfoliopedro.repository;

import com.portfolio.portfoliopedro.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bannerrepo extends JpaRepository <Banner, Long>{
    
}
