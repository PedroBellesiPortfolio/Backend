
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
@Table(name = "experiencia")
@Entity
public class Experiencia implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idexperiencia;
    @Column(length= 255)
    private String titulo_puesto;
    @Column(length= 255)
    private String empresa;
    @Column(length= 255)
    private String logo_empresa;
    @Column(length= 255)
    private String descripcion_tareas;
    private int year_inicio;
    private int year_cierre;
    private int orden_experiencia;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="Idusuario")
    private Usuario usuarioex;     
   

    public Experiencia() {
    }

    public Experiencia(Long idexperiencia, String titulo_puesto, String empresa, String logo_empresa, String descripcion_tareas, int year_inicio, int year_cierre, int orden_experiencia, Usuario usuarioex) {
        this.idexperiencia = idexperiencia;
        this.titulo_puesto = titulo_puesto;
        this.empresa = empresa;
        this.logo_empresa = logo_empresa;
        this.descripcion_tareas = descripcion_tareas;
        this.year_inicio = year_inicio;
        this.year_cierre = year_cierre;
        this.orden_experiencia = orden_experiencia;
        this.usuarioex = usuarioex;
    }

   

    

    
    
    
    
}
