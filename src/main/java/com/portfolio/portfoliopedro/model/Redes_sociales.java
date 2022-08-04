
package com.portfolio.portfoliopedro.model;


import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Table(name = "redes_sociales")
@Entity
public class Redes_sociales implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idredes;
    @Column(length= 255)
    private String red;
    @Column(length= 255)
    private String logo_red;
    @Column(length= 255)
    private String link_red;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="Idusuario")
    private Usuario usuariore;    
   

    public Redes_sociales() {
    }

    public Redes_sociales(Long idredes, String red, String logo_red, String link_red, Usuario usuariore) {
        this.idredes = idredes;
        this.red = red;
        this.logo_red = logo_red;
        this.link_red = link_red;
        this.usuariore = usuariore;
    }

   
    
    
    
}
