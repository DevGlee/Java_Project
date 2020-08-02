/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectlearnjava;

/**
 *
 * @author DevGlee
 */

// LES TABLEAUX

public class Cls4 {
    
    public static void main(String [] args) {
        
        char alpha [] =  {'a','b','c','d','e','f','g','i','j','k'}; // On iniatialise le tableau et son contenu
        
        
       for (int i=0; i<alpha.length; i++) // Avec la boucle for on va parcourir le tableau tout en incrementant l'indice i
       {
           System.out.println("A l'emplacement " + i + " l'indice = " + alpha[i]);// Affichage
       }
        
    }
    
}
