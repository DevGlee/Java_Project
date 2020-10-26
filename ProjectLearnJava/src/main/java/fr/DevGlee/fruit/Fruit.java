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
public abstract class Fruit {
    
    public abstract void taste();
    public abstract int getSize();
    public abstract boolean hasSeed();
    
    public void miam(){
        System.out.println("Manger 5 fruits et légumes par jour");
    }
}
