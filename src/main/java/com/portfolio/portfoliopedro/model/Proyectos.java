
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
@Table(name = "proyectos")
@Entity
public class Proyectos implements Serializable{
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idproyectos;
    @Column(length= 255)
    private String titulo_proyecto;
    @Column(length= 255)
    private String link_proyecto;
    @Column(length= 255)
    private String foto_proyecto;
    private String descripcion_proyecto;
    private String tecnologias;
    private int year_proyecto;
    private int orden_proyectos;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="Idusuario")
    private Usuario usuariopr;  
  

    public Proyectos() {
    }

    public Proyectos(Long idproyectos, String titulo_proyecto, String link_proyecto, String foto_proyecto, int orden_proyectos, Usuario usuariopr) {
        this.idproyectos = idproyectos;
        this.titulo_proyecto = titulo_proyecto;
        this.link_proyecto = link_proyecto;
        this.foto_proyecto = foto_proyecto;
        this.orden_proyectos = orden_proyectos;
        this.usuariopr = usuariopr;
    }

   

   
    
    
}
