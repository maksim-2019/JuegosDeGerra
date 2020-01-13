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
public class Soldado {

    private String nombre;
    private double vida;
    private boolean muerto = false;

    public Soldado(String nombre, double vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public void atacar(Arma arma1, Soldado soldado1) {
        if (soldado1.getVida() > 0) {
            arma1.disparar(soldado1);
        } else {
            System.out.println("Esta Muerto");
            soldado1.setMuerto(true);
        }

    }

    public void atacar(Arma arma1, Medico medico1) {
        if (medico1.getVida() > 0) {
            arma1.disparar(medico1);
        } else {
            System.out.println("Esta Muerto");
            medico1.setMuerto(true);
        }
    }

    public Soldado copia() {
        Soldado soldado1 = new Soldado(this.nombre, this.vida);
        return soldado1;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", vida=" + vida + ", muerto=" + muerto + '}';
    }

}
