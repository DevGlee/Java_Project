/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.car;

/**
 *
 * @author DevGlee
 */
public class Main{
    
    public static void main (String [] args){
        
        Audi a1= new Audi();
        
        
       
        
        System.out.println("Nouveau modele AUDI : "+a1.getModel()+" "+a1.getWeight()+" "+a1.getReservoir()+" "+a1.getHorsepower()+" "+a1.getFuel()+" "+a1.Engine());
        
       
    }
    
}
