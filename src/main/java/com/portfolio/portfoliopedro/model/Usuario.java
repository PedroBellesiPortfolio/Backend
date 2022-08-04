
package com.portfolio.portfoliopedro.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Table(name = "usuario")
@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idusuario; 
    
    @Column(name="nombre")
    private String nombre;
    
 
        
   @OneToMany(mappedBy="usuariope",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
   @JsonIgnore
   private List<Persona> personasb;
    
   @OneToMany(mappedBy="usuarioba",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
   @JsonIgnore
   private List<Banner> banners;
    
   @OneToMany(mappedBy="usuarioed",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
   @JsonIgnore
   private List<Educacion> Educasb;
    
   @OneToMany(mappedBy="usuarioex",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
   @JsonIgnore
   private List<Experiencia> Experiencias;
    
   @OneToMany(mappedBy="usuariopr",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
   @JsonIgnore
   private List<Proyectos> Prolist;
    
   @OneToMany(mappedBy="usuariosk",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
   @JsonIgnore
   private List<Skills> Sklist;
   
   @OneToMany(mappedBy="usuariore",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
   @JsonIgnore
   private List<Redes_sociales> redlist;
    

        public Usuario() {
        
        
        }

    public Usuario(Long idusuario, String nombre) {
        this.personasb = new ArrayList<>();
        this.banners = new ArrayList<>();
        this.Educasb = new ArrayList<>();
        this.Experiencias = new ArrayList<>();
        this.Prolist = new ArrayList<>();
        this.Sklist = new ArrayList<>();
        this.redlist = new ArrayList<>();
        this.idusuario = idusuario;
        this.nombre = nombre;
    }
    

    

    

   

        
        
    
    
}
