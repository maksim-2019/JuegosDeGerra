/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegoguerra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author maksim
 */
public class PJuego {

    public static void main(String[] args) {
        ArrayList<String> jugadorArray = new ArrayList<String>();
        int participantes = 12;
        Random aleatorio = new Random();
        int resul = aleatorio.nextInt(participantes) + 1;
        int uno = 0, dos = 0;
        int contador = 0;
        boolean si1 = false;
        boolean si2 = false;
        Soldado arraySoldado[] = new Soldado[13];
        Arma arrayArma[] = new Arma[13];
        Municion arrayMunicion[] = new Municion[13];
        //Creacion de x numero de soldados y guardarlos en una array.
        for (int i = 1; i < arraySoldado.length; i++) {
            jugadorArray.add("Soldado"+i);
            arraySoldado[i] = new Soldado("Soldado" + i, 100);
            arrayMunicion[i] = new Municion("9mm-" + i, 3);
            arrayArma[i] = new Arma("Pistola" + i, 30, arrayMunicion[i]);
            System.out.println(arrayArma[i]);
            System.out.println(arraySoldado[i]);
        }
        do {
        do {
            do {
                uno = aleatorio.nextInt(participantes) + 1;
                if (arraySoldado[uno].isMuerto() == false) {
                    si1 = true;
                }
            } while (si1 != true);
            do {
                dos = aleatorio.nextInt(participantes) + 1;
                if (arraySoldado[dos].isMuerto() == false) {
                    si2 = true;
                }
            } while (si2 != true);

        } while (uno == dos);
        
//            if (arraySoldado[dos].isMuerto() == true) {
//                System.out.println("El enemigo esta abatido");
//            } else if (arraySoldado[uno].isMuerto() == true) {
//                System.out.println("No puedes disparar. A no ser que seas un zombi");
//            } else {
                arraySoldado[uno].atacar(arrayArma[uno], arraySoldado[dos]);
                if(arraySoldado[dos].isMuerto() == true){
                    jugadorArray.remove(arraySoldado[dos].getNombre());
                }
                System.out.println("El " + arraySoldado[uno].getNombre() + " a atacado a " + arraySoldado[dos].getNombre());
           // }
              
        } while (jugadorArray.size() != 1);
        Iterator<String> jugadorIterator = jugadorArray.iterator();
        System.out.println("El ganador es: " + jugadorIterator.next());
    }
}
