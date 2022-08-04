
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
@Table(name = "banner")
@Entity
public class Banner implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idbanner;
    @Column(length= 255)
    private String foto_fondo;
    @Column(length= 255)
    private String foto_entidad;
    @Column(length= 200)
    private String experiencia_resumen;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="Idusuario")
    private Usuario usuarioba;

    public Banner() {
    }

    public Banner(Long idbanner, String foto_fondo, String foto_entidad, String experiencia_resumen, Usuario usuarioba) {
        this.idbanner = idbanner;
        this.foto_fondo = foto_fondo;
        this.foto_entidad = foto_entidad;
        this.experiencia_resumen = experiencia_resumen;
        this.usuarioba = usuarioba;
    }

   

   

    

    
    
}
