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
public class Audi extends Car implements AdvancedFeature {

    
    public Audi () {
        super("A1", 1175, 40, 82, "Sans plomb");

    }

    @Override
    public String Engine() {
        return ("Moteur 30 TFSI 6-speed");
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
