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
public class Porsche extends Car implements Feature {

    public Porsche(String model, double weight, double reservoir, int horsepower, String fuel) {
        super(model, weight, reservoir, horsepower, fuel);
    }

    @Override
    public String Engine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Speed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Acceleration() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
