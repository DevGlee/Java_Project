/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.player;

/**
 *
 * @author DevGlee
 */
// Classe Principale
public class Main  {

    public static void main(String[] args) {
        
        Player p1 = new Player("Nomura",5.0,50.0);
        System.out.println("nom :"+p1.getName());
        p1.setPa(80.0);
        System.out.println(" vie actuelle "+p1.getPv());
        
        
        

        Player p2 = new Player("Baki",8.0,80.0);
        
        System.out.println(" nom: "+p2.getName());
        
        p2.damage(p1.getPa());
        
        System.out.println(p1.getName()+" Attaque "+p2.getName());
        System.out.println(p2.getName()+" subit "+p1.getPa()+" de dégats");
        System.out.println("Les pv de "+p2.getName()+" sont à "+p2.getPv());
    
    }
}
