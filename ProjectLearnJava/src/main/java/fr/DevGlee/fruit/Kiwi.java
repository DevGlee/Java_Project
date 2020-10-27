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
public class Kiwi extends Fruit implements PeelFruit {

  
    
    public Kiwi() {
        super("Fraise");
    }
    

    @Override
    public void taste() {
        System.out.println("Le kiwi est sucré");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }

    @Override
    public boolean isPeeled() {
        return true;
    }

    @Override
    public String getSkinType() {
        return "";
    }

    @Override
    public String getSkinColor() {
        return "marron et vert";
    }
    
}
