
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
@Table(name = "skills")
@Entity
public class Skills implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idskills;
    @Column(length= 255)
    private String skill;
    private int porcentaje;
    private int orden_skill;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Idusuario")
    private Usuario usuariosk;     
      
    

    public Skills() {
    }

    public Skills(Long idskills, String skill, int porcentaje, int orden_skill, Usuario usuariosk) {
        this.idskills = idskills;
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.orden_skill = orden_skill;
        this.usuariosk = usuariosk;
    }

    
    
    
}
