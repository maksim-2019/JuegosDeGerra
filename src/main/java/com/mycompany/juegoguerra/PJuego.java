/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegoguerra;

import java.util.Random;

/**
 *
 * @author maksim
 */
public class PJuego {

    public static void main(String[] args) {

        int participantes = 5;
        Random aleatorio = new Random();
        int resul = aleatorio.nextInt(participantes) + 1;

        Soldado arraySoldado[] = new Soldado[13];
        Arma arrayArma[] = new Arma[13];
        Municion arrayMunicion[] = new Municion[13];
        
        for(int i=1;i < arraySoldado.length; i++){
            arraySoldado[i] = new Soldado("Soldado"+i, 100);
            //arrayArma[i] = new Arma("Pistola", 30,);
            System.out.println(arraySoldado[i]);
        }
    }
}
