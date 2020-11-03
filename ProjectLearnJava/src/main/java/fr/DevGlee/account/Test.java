/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.account;

/**
 *
 * @author DevGlee
 */
public class Test  {
    
    public static void main(String [] args){
        
        Account a1= new Account(000001,"Billy","TheKid",500);
        Account a2= new Account(000002,"The","Joker",500);
        
        System.out.println("Informations sur les comptes");
        
        a1.Afficher();
        a2.Afficher();
        
        
        System.out.println("Virement du compte a1 au compte a2");
       a1.virer(a2, 30);
        
       System.out.println("Informations sur les comptes");
        a1.Afficher();
        a2.Afficher();
    }
}
