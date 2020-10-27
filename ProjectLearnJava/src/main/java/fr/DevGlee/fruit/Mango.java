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
public class Mango extends Fruit implements PeelFruit {
    
    public Mango(){
        super("Mangue");
    }
    
    @Override
    public void taste() {
       super.miam();
    }

    @Override
    public int getSize() {
        return 2;
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
        return "lisse";
    }

    @Override
    public String getSkinColor() {
        return "verte";
    }
    
}
