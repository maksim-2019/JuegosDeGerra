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
public class Juego {

    public static void main(String[] args) {

        Soldado soldado1 = new Soldado("Stiven", 100);
        Soldado soldado2 = new Soldado("Paol", 100);
        //Copia de Soldado1
        Soldado soldado3 = soldado1.copia();
        System.out.println(soldado3);

        Medico medico1 = new Medico("Pablo", 100, 20);
        Municion municion1 = new Municion("balas", 3);
        Arma arma1 = new Arma("pistola", 40, municion1);
        //Prueba de ataque.
        soldado2.atacar(arma1, soldado1);
        System.out.println(soldado1.getVida());
        //Prueba de curacion
        medico1.curar(soldado1);
        System.out.println(soldado1.getVida());

    }
}
