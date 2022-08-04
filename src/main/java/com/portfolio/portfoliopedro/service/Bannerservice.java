
package com.portfolio.portfoliopedro.service;

import com.portfolio.portfoliopedro.model.Banner;
import com.portfolio.portfoliopedro.repository.Bannerrepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bannerservice implements Ibannerservice{

    @Autowired
    public Bannerrepo banrepo;
    
    @Override
    public List<Banner> verBanner() {
        return banrepo.findAll();
}
    @Override
    public void modificarBanner(Banner ban) {
       banrepo.save(ban);
    }
    
}
