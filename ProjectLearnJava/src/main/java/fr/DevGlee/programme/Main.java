/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.programme;

/**
 *
 * @author DevGlee
 */
// Classe Principale
public class Main {

    public static void main(String[] args) {

        int money = 850;
        int pricephone = 800;
        boolean hasPhone = false;

        if (money >= pricephone && !hasPhone) {

            System.out.println("Tu peux acheter le telephone");
        } else {
            System.out.println("Tu ne peux pas acheter le telephone ou tu en as déjà un ");
        }

        String pseudoss = "DevGlee,Bijoul,Toby";
        String[] pseudos = pseudoss.split(",");
        System.out.println(pseudos[1]);
        int[] notes = {17, 8, 12, 20};

        int i = 0;

        do {
            System.out.println("bOKIT");
        } while (!hasPhone);

    }
}
