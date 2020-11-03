/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.devglee.calculatriceincrementale;

/**
 *
 * @author DevGlee
 */
public class CalculatriceIncrementale {

    //Ajouter
    int ajouter(int a, int b) {
        for (int i = 0; i < b; i++) {
            if (b > 0) {
                a++;
            } else {
                a--;
            }
        }
        return a;
    }
//Soustraire

    int soustraire(int a, int b) {
        for (int i = 0; i < b; i++) {
            if (b > 0) {
                a--;
            } else {
                a++;
            }
        }
        return a;
    }
//Multiplier

    int multiplier(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int res = a;
        for (int i = 1; i < b; i++) {
            for (int j = 0; j < a; j++) {
                res++;
            }
        }
        return res;
    }
//Diviser

    public int diviser(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int res = 1;
        while (a >= b) {
            for (int i = 0; i < b; i++) {
                a--;
            }
            res = res++;
        }
        return res;
    }

}
