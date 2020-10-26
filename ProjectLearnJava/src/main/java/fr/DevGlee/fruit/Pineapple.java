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
public class Pineapple extends Fruit {

    @Override
    public void taste() {
        System.out.println("L'ananas a un goût un peu acide");
    }

    @Override
    public int getSize() {
        return 3;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }
    
}
