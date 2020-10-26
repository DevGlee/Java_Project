/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.fruit;

/**
 *
 * @author DevGlee
 */
public class Strawberry extends Fruit {

    public Strawberry() {
        super("Fraise");
    }

    @Override
    public void taste() {
        System.out.println("La fraise est sucré");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return true;
        
    }
    
}
