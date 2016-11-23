/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author T-107
 */
@Entity

public class Clientee implements Serializable{
    
    @Id
    @GeneratedValue
    
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @OneToOne
    @JoinColumn(name="id_tarjetas")
    
    private Tarjetas tarjeta;
    private String nombre;

    public Clientee(Tarjetas tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Clientee(String nombre) {
        this.nombre = nombre;
    }

    public Clientee() {
    }

    public Clientee(Long id) {
        this.id = id;
    }

    public Clientee(Tarjetas tarjeta, String nombre) {
        this.tarjeta = tarjeta;
        this.nombre = nombre;
    }

    public Tarjetas getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjetas tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
