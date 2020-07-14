/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectlearnjava;

/**
 *
 * @author DevGlee
 */
public class cls1 {
        public static void main(String [] args) {
            // TODO Auto-generated method stub 
            
        //Affichage    
            System.out.println("Hello World!");
            System.out.println("My name is arnaud");
            
        //Type String
        
            //Première méthode de déclaration
            String phrase;
            phrase = "Brand New Drip";
            
            //Deuxième méthode de déclaration
            
            String str = new String();
            str = "Brand New Stuff";
            
            //Troisième méthode de déclaration
            String string = "Brand New Thing";
            
            //Quatrième méthode de déclaration
            String chaine = new String("Brand New Whip");
            
            /*Syntaxe diminutif addition
            nbre1 = nbre1+1 equivaut à :
            nbre1 += 1;
            nbre1++;
            ++nbre1;
                    */
            
            /*Syntaxe diminutif soustraction
            nbre1 = nbre1-1 equivaut à :
            nbre1 -= 1;
            nbre1--;
            --nbre1;
                    */
            
            /*Syntaxe diminutif multiplication
            nbre1 = nbre1*1 equivaut à :
            nbre1 *= 2;
           
                    */
            
            /*Syntaxe diminutif division
            nbre1 = nbre1/2 equivaut à :
            nbre1 /= 2;
            
                    */
            
        //Affichage résultat opérations
            
        double nbre1 = 50, nbre2 = 100;
        int resultat = (int) (nbre1 * nbre2);
        System.out.println("Le resultat de l'opération est : " + resultat);
       
        
        // Conversion , cast
        int nb1 = 8 , nb2 =7;
        double resultat1 =  ((double) nb1 / (double)nb2); // Cast de chaque nombre avec le bon type de variable pour avoir le résulta correct
        System.out.println("Le resultat est" + resultat1);
        
        
        //Ici la variable u est égale a 42
        int u =42;
        String z = new String();//variable z de type string
        z = z.valueOf(u);// String z hérite du nombre 42 
        int s = Integer.valueOf(z).intValue();// int s prend la valeur de z
        System.out.println("s = " + s);//La variable s de type int est égale à 42
        
        
        }
    
}
