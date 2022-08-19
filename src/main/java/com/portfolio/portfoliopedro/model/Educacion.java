
package com.portfolio.portfoliopedro.model;


import java.io.Serializable;
import java.util.Date;
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
@Table(name = "educacion")
@Entity
public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ideducacion;
    @Column(length= 255)
    private String institucion;
    @Column(length= 255)
   private String titulo;
    @Column(length= 255)
   private String logo_institucion;
   private int completado;
   private Date fecha_finalizacion_titulo;
   private int orden_titulo;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Idusuario")
    private Usuario usuarioed;   

    public Educacion() {
    }

    public Educacion(Long ideducacion, String institucion, String titulo, int completado, Date fecha_finalizacion_titulo, int orden_titulo, Usuario usuarioed) {
        this.ideducacion = ideducacion;
        this.institucion = institucion;
        this.titulo = titulo;
        this.completado = completado;
        this.fecha_finalizacion_titulo = fecha_finalizacion_titulo;
        this.orden_titulo = orden_titulo;
        this.usuarioed = usuarioed;
    }
    

   

   

   

    

   
    
    
}
