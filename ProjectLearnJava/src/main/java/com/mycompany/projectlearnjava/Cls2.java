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
public class Cls2 {
    
    public static void main(String [] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Saisissez un mot : ");
    String str = sc.nextLine();
    System.out.println("Vous avez saisi :"+ str);
    
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Saisissez un nombre :" );
    int nb = sc.nextInt();
    System.out.println("Vous avez saisi ce nombre :" +  nb);
    
    
    /*Convention de nommage java pour Scanner 
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    double d = sc.nextDouble();
    long l = sc.nextLong();
    byte b = sc.nextByte();
    
    */
    
    //Cas spécial où l'instruction Scanner ne prend pas en charge le type char 
    
    System.out.println("Saisissez un mot");
    Scanner sc2 = new Scanner(System.in);
    String lt1 = sc2.nextLine();// On crée une variable string qui héritera de la variable char (lt1)
    char lt2 = lt1.charAt(1);// lt2 hérite de lt1 et prend le 2ème caratère du mot écris
    System.out.println("Vous avez saisi: " + lt2);
    
    
    }
}
