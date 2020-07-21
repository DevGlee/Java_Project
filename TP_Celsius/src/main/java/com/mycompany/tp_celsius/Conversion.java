/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp_celsius;

import java.util.Scanner;

/**
 *
 * @author DevGlee
 */
// CONVERTISSEUR DEGRER CELSIUS ET DEGRE FAHRENHEIT
public class Conversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double tempAconvertir , tempConvertit=0;
        char reponse =' ' , mode=' ';
    do{   // tant que reponse == O / Boucle principale pour retourner au debut du programme
       do{//Tant que mode est différent de 1 et 2
           
           //Choisir le mode
       mode=' ';
        System.out.println("Choisissez le mode de conversion");
        System.out.println("1- Convertisseur Celsius - Fahrenheit");
        System.out.println("2- Convertisseur  Fahrenheit - Celsius");
        
        mode= sc.nextLine().charAt(0);
        
        if(mode !='1' && mode !='2'){ // si le mode n'est ni 1 ni 2 on affiche mode inconnu
            System.out.println("Mode inconnu");
        }
       }while(mode !='1' && mode !='2');//Le mode est inconnu donc on retourne au debut de la boucle do
        
        //Saisir la température 
        
        System.out.println("Température a convertir :"); //On récupère la température à convertir
        
        tempAconvertir = sc.nextDouble();
        
        sc.nextLine();//On vide la ligne
        
        if(mode=='1'){
            
            tempConvertit= ((9.0/5.0)*tempAconvertir)+32.0;
            System.out.print(tempAconvertir + "C° correspond à :");
            System.out.println(tempConvertit+"F°");
        }
        
        else{
            tempConvertit= ((tempAconvertir-32)*5)/9;
            System.out.print(tempAconvertir + "F° correspond à :");
            System.out.println(tempConvertit+"C°");
        }
        
        do{ //On demande a l'utilisateur si il veut recommencer
            System.out.println("Voulez vous convertir une autre température?");
            
            reponse = sc.nextLine().charAt(0);
        }while(reponse !='O' && reponse !='N');//Si la reponse est différente de O ou N 
        
    }while(reponse =='O');// Ici si la conditions est respecté le programme retourne au début
    
    System.out.println("Au revoir");
    
    //Fin du programme
            
            


           


            
            
        

            
        } 
  public static double arrondi(double A, int B) {
        return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10,
                B);
    }

  
    
}

