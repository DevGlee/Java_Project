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
public class Apple extends Fruit implements PeelFruit {

    public Apple() {
        super("Pomme");
    }

    @Override
    public void taste() {
        super.miam();
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
        return false;
    }

    @Override
    public String getSkinType() {
        return "lisse";
    }

    @Override
    public String getSkinColor() {
        return "vert ou rouge";
    }
    
}
