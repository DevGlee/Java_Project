/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectlearnjava;

import java.util.Scanner;

/**
 *
 * @author DevGlee
 */
public class Cls3 {

    public static void main(String[] args) {

        //Conditions if
        int i = -10;

        if (i > 0) {
            System.out.println("L'entrée est positif");
        } else if (i < 0) {

            System.out.println("L'entrée est négatif");
        } else {
            System.out.println("L'entrée est nulle");

        }

        int j = 100;

        if (j >= 0 && j <= 100) {
            System.out.println("Le nombre est compris dans l'intervalle");
        } else {
            System.out.println("Le nombre n'est pas compris dans l'intervalle");
        }

        //Switch int
        int note = 20; //Note sur 20

        switch (note) {
            case 0:
                System.out.println("Aucun travail");
                break;

            case 10:
                System.out.println("Tout juste la moyenne");
                break;
            case 20:
                System.out.println("Excellent Travail");
                break;
            default:
                System.out.println("Il faut davantage travailler");
        }
        
        //Switch string
        String chaine = "Bonjour" ;

        switch (chaine) {
            case "Bonjour":
                System.out.println("Bonjour monsieur");
                break;

            case "Bonsoir":
                System.out.println("Bonsoir monsieur");
                break;
            default:
                System.out.println("Bonjoir :V");
        }
    }

}
