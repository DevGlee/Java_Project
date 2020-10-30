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
        Audi a3= new Audi();
        a3.setModel("A3 SportBack");
        a3.setWeight(1265);
        a3.setReservoir(50);
        a3.setHorsepower(85);
        a3.setFuel("Sans Plomb 95");
        
        System.out.println("Nouveau modele AUDI : "+a1.getModel()+" "+a1.getWeight()+" "+a1.getReservoir()+" "+a1.getHorsepower()+" "+a1.getFuel()+" "+a1.Engine());
        
        System.out.println("Nouveau modele AUDI : "+a3.getModel()+" "+a3.getWeight()+" "+a3.getReservoir()+" "+a3.getHorsepower()+" "+a3.getFuel());
        
    }
    
}
