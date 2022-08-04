
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
@Table(name = "persona")
@Entity
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idpersona;
    @Column(length= 255)
    private String nombre;
    @Column(length= 255)
    private String apellido;
    private Date fecha_nacimiento;
    @Column(length= 255)
    private String ciudad;
    @Column(length= 255)
    private String provincia;
    @Column(length= 255)
    private String pais;
    @Column(length= 255)
    private String telefono;
    @Column(length= 255)
    private String email;
    @Column(length= 10)
    private String usuarioclave;
    @Column(length= 20)
    private String clave;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="Idusuario")
    private Usuario usuariope;

    public Persona() {
    }

    public Persona(Long idpersona, String nombre, String apellido, Date fecha_nacimiento, String ciudad, String provincia, String pais, String telefono, String email, String usuarioclave, String clave, Usuario usuariope) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.telefono = telefono;
        this.email = email;
        this.usuarioclave = usuarioclave;
        this.clave = clave;
        this.usuariope = usuariope;
    }

  

    
        
    }

   

    


    

   
    


    
    