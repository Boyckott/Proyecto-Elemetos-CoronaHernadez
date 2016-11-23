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
public class Cliente implements Serializable{
   @Id
   @GeneratedValue
   private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estacionamiento getEsta() {
        return esta;
    }

    public void setEsta(Estacionamiento esta) {
        this.esta = esta;
    }

    public float getPago() {
        return pago;
    }

    public void setPago(float pago) {
        this.pago = pago;
    }
   
   @OneToOne
   @JoinColumn(name="id_estacionamiento")
   private Estacionamiento esta;

   private float pago;

    public Cliente(float pago) {
        this.pago = pago;
    }

    public Cliente(Estacionamiento esta) {
        this.esta = esta;
    }

    public Cliente(Long id) {
        this.id = id;
    }

    public Cliente(Estacionamiento esta, float pago) {
        this.esta = esta;
        this.pago = pago;
    }

    public Cliente(Long id, Estacionamiento esta, float pago) {
        this.id = id;
        this.esta = esta;
        this.pago = pago;
    }

    public Cliente() {
    }
   
   
}
