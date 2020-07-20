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

        //Condition switch
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
        String chaine = "Bonjour";

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

        //Condition while
        //Variable vide
        String prenom;

        //On initialise celle-ci pour oui
        char answer = 'O';

        //Objet Scanner pour récupérer la réponse
        Scanner rp = new Scanner(System.in);

        //Tant que la réponse est oui 'O'
        while (answer == 'O') {

            System.out.println("Donner un prénom");

            prenom = rp.nextLine();//On recupère le prenom

            System.out.println("Bonjour " + prenom + " , comment vas-tu?");//On l'affiche

            answer = ' ';//On initialise la réponse a vide

            //Tant que la réponse n'est pas ni 'O' ou ni 'N' la boucle s'active
            while (answer != 'O' && answer != 'N') {

                System.out.println("Voulez-vous réessayez?");

                answer = rp.nextLine().charAt(0);

            }
        }

        System.out.println("Au revoir");

        int f = 1, g = 50;

        while (f < g) {

            System.out.println("Coucou " + f + "fois !!");
            f++;
        }

        //alternative
        int u = 1, o = 50;

        while (u++ < o) {

            System.out.println("Coucou " + u + "fois!!");
        }

        //  boucle do while
        String nom;
        char reponse = ' ';

        Scanner aw = new Scanner(System.in);

        do {
            System.out.println("Donnez un nom");

            nom = aw.nextLine();

            System.out.println("Bonjour " + nom + " , Comment vas-tu?");

            do {
                System.out.println("Voulez-vous reesayez ?");
                reponse = aw.nextLine().charAt(0);
            } while (reponse != 'O' && reponse != 'N');

        } while (reponse == 'O');

        System.out.println("Au revoir");

        //boucle for
        for (int l = 1; l <= 10; l++) {

            System.out.println("Voici la ligne " + l);
        }

        for (int m = 10; m >= 0; m--) {

            System.out.println("Voici la ligne  " + m);
        }

        for (int v = 0, q = 2; (v < 10 && q < 6); v++, q += 2) {

            System.out.println("v = " + v + "q = " + q );
        }
    }

}
