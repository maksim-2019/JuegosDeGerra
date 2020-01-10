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
public class Medico {

    private String nombre;
    private double vida;
    private double cura;
    private boolean muerto = false;

    public Medico(String nombre, double vida, double cura) {
        this.nombre = nombre;
        this.vida = vida;
        this.cura = cura;
    }

    public double getCura() {
        return cura;
    }

    public void setCura(double cura) {
        this.cura = cura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public void curar(Soldado soldado1) {
        if (soldado1.getVida() > 80) {
            soldado1.setVida(100);
        } else if (soldado1.getVida() <= 0) {
            System.out.println("No puedo curarlo");
        } else {
            soldado1.setVida(soldado1.getVida() + this.cura);
        }

    }

    public void curar(Medico medico1) {
        if (medico1.getVida() > 80) {
            medico1.setVida(100);
        } else if (medico1.getVida() <= 0) {
            System.out.println("No puedo curarlo");
        } else {
            medico1.setVida(medico1.getVida() + this.cura);
        }
    }
}
