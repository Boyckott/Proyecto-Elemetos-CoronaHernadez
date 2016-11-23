/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author T-107
 */
@Entity
public class Tarjetas implements Serializable{
    @Id
    @GeneratedValue
    
    private Long id;
  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    private String tipo;
    private float saldo;
    private Date fecha;
    
     public Tarjetas() {
    }

    public Tarjetas(Long id) {
        this.id = id;
    }

    public Tarjetas(String tipo, float saldo, Date fecha) {
        this.tipo = tipo;
        this.saldo = saldo;
        this.fecha = fecha;
    }

    public Tarjetas(float saldo) {
        this.saldo = saldo;
    }

    public Tarjetas(String tipo) {
        this.tipo = tipo;
    }

    public Tarjetas(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
}
