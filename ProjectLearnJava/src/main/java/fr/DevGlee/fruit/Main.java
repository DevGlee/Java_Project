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
public class Main {
    
    public static void main(String [] args){
        
        Apple a = new Apple();
        a.taste();
       
        
        Pineapple p = new Pineapple();
        p.taste();
        
        if(!(a instanceof PeelFruit)) {
            System.out.println("Ce fruit n'implemente pas l'interface PeelFruit");
        }}
}
