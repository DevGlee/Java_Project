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
public class Pineapple extends Fruit implements PeelFruit {

    private boolean peeled=false;
    
    public Pineapple() {
        super("Ananas");
    }

    @Override
    public void taste() {
        
        super.miam();
    }

    @Override
    public int getSize() {
        return 3;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }

    @Override
    public boolean isPeeled() {
        return true;
    }

    @Override
    public String getSkinType() {
        return "doux";
    }
    
}
