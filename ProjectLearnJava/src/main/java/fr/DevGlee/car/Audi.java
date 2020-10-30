/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.car;

import java.util.Scanner;

/**
 *
 * @author DevGlee
 */
public class Audi extends Car implements Feature {

    String model = getModel();
    public Audi() {
        super("A1 Sportback",1175,40,140,"Essence Sans Plomb 95");
    }

 
  
    


    @Override
    public String Engine() {
        
        System.out.println("Entrez le moteur du véhicule");
        Scanner scanner = new Scanner( System.in );
        String Engine = scanner.nextLine();
        return Engine;
    }

    @Override
    public double Speed() {
     return 206;  
    }

    @Override
    public double Acceleration() {
       return 9.9;
    }

    
    
}
