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
// LES TABLEAUX
public class Cls4 {

    public static void main(String[] args) {
        //TABLEAU UNIDIMENSIONNEL
        char alpha[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k'}; // On iniatialise le tableau et son contenu

        /*   for (int i=0; i<alpha.length; i++) // Avec la boucle for on va parcourir le tableau tout en incrementant l'indice i
       {
           System.out.println("A l'emplacement " + i + " l'indice = " + alpha[i]);// Affichage
       } */
        int i = 0;
        char reponse = ' ', carac = ' ';
        Scanner sc = new Scanner(System.in);

        do {//Boucle principale
            do {//tant que l'utilisateur n'a pas entrée une lettre présente dans le tableau la boucle se répète
                i = 0;
                System.out.println("entrez une lettre en minuscule");

                carac = sc.nextLine().charAt(0);
                //Boucle de recherche
                while (i < alpha.length && carac != alpha[i]) {
                    i++;
                }
                //Si i n'a pas dépassé le nombre d'indice du tableau 
                if (i < alpha.length) {
                    System.out.println("La lettre " + carac + " est présente dans le tableau");
                    
                } else {//Si il y a dépassement alors
                    System.out.println("La lettre " + carac + " n'est pas présente dans le tableau");
                }

            } while (i >= alpha.length);

            do {
                System.out.println("Voulez vous reessayez à nouveau O/N");
                reponse = sc.nextLine().charAt(0);
            } while (reponse != 'O' && reponse != 'N');

        } while (reponse == 'O');

        System.out.println("A plus");
     
      //TABLEAU MULTIDIMENSIONNEL  
        
        String tab [][] = {{"traction","pompe","dips","burpees","squat"},{"1","2","3","4"}};
        
       int z = 0 , c = 0;
       
       for(String sousTab[] : tab){
           z=0;
           for(String str : sousTab){
               System.out.println("La valeur de la nouvelle boucle est " + str);
               System.out.println("La valeur du tableau à l'indice["+c+"] ["+z+"] est : " + tab[c][z]);
               z++;
           }
           c++;
       }
    }
     
    
}
