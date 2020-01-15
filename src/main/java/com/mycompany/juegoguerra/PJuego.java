/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegoguerra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maksim
 */
public class PJuego {

    public static void main(String[] args) {
        ArrayList<String> jugadorArray = new ArrayList<String>();


        Random aleatorio = new Random();
        // int resul = aleatorio.nextInt(participantes) + 1;
        int uno = 0, dos = 0;

        boolean si1 = false;
        boolean si2 = false;

        Scanner teclado = new Scanner(System.in);
        String nombre;
        int participantes = 0;
        System.out.println("Cuantos participaran es esta batalla: ");
        participantes = teclado.nextInt();

        Soldado arraySoldado[] = new Soldado[participantes];
        Arma arrayArma[] = new Arma[participantes];
        Municion arrayMunicion[] = new Municion[participantes];
        //Solicita numero de participanes.

        //Creacion de x numero de soldados y guardarlos en una array.
        for (int i = 0; i < arraySoldado.length; i++) {
            //Permite poner nombre a cada participante.
            
            System.out.println("Pon el nombre del jugador: " + i);
            nombre = teclado.next();

            jugadorArray.add(nombre + i);
            arraySoldado[i] = new Soldado(nombre + i, 100);
            arrayMunicion[i] = new Municion("9mm-" + i, 3);
            arrayArma[i] = new Arma("Pistola" + i, 30, arrayMunicion[i]);
            System.out.println(arrayArma[i]);
            System.out.println(arraySoldado[i]);
            nombre = teclado.nextLine();
        }
        do {
            do {
                do {
                    uno = aleatorio.nextInt(participantes);
                    if (arraySoldado[uno].isMuerto() == false) {
                        si1 = true;
                    }
                } while (si1 != true);
                do {
                    dos = aleatorio.nextInt(participantes);
                    if (arraySoldado[dos].isMuerto() == false) {
                        si2 = true;
                    }
                } while (si2 != true);

            } while (uno == dos);

            arraySoldado[uno].atacar(arrayArma[uno], arraySoldado[dos]);
            if (arraySoldado[dos].isMuerto() == true) {
                jugadorArray.remove(arraySoldado[dos].getNombre());
            }
            System.out.println("El " + arraySoldado[uno].getNombre() + " a atacado a " + arraySoldado[dos].getNombre());

        } while (jugadorArray.size() != 1);
        Iterator<String> jugadorIterator = jugadorArray.iterator();
        System.out.println("El ganador es: " + jugadorIterator.next());
    }
}
