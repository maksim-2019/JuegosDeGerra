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
public class Municion {
    private String id;
    private int cantidad;

    public Municion(String id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void restar(){
        if(this.cantidad == 0){
            System.out.println("No queda Municion");
        }else {
            this.cantidad--;
        }

    }
}
