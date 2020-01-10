/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegoguerra;

/**
 *
 * @author maksim
 */
public class Arma {

    private String nombre;
    private double daño;
    private Municion municion;
    
    public Arma(String nombre, double daño, Municion municion1) {
        this.nombre = nombre;
        this.daño = daño;
        this.municion = municion1;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void disparar(Soldado soldado1) {
        if (this.municion.getCantidad() > 0) {
            soldado1.setVida(soldado1.getVida() - this.daño);
            this.municion.setCantidad(this.municion.getCantidad() - 1);
        }

    }

    public void disparar(Medico medico1) {
        if (this.municion.getCantidad() > 0) {
            medico1.setVida(medico1.getVida() - this.daño);
            this.municion.setCantidad(this.municion.getCantidad() - 1);
        }
    }
}
