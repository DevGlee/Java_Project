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
public class Account {
    
    private int id;
    private String nom;
    private String prenom;
    private double solde;

    public Account(int id, String nom, String prenom, double solde) {
        this.id=id;
        this.nom = nom;
        this.prenom = prenom;
        this.solde = solde;
    }

    public void Afficher() {
        System.out.println("Identifiant du compte : "  + getId() + " |Nom : " + getNom() + "| Prenom : " + getPrenom() + "| Solde : " + getSolde());
    }

    public void crediter(double somme) {
        this.solde = solde + somme ;
    }

    public boolean debiter(double somme) {

        if (solde >= 0) {

            this.solde = solde - somme;

            System.out.println("Débit réussie");
            return true;

        } else {

            System.out.println("Echec de l'opération");
            return false;
        }
    }

    public boolean virer(Account a2,double somme) {
    
        if(a2.solde>=0){
        
        debiter(somme);
        a2.crediter(somme);
        
            System.out.println("Virement réussie");
        
        return true;
        }
        else{
            
            System.out.println("Echec de l'opération");
            
        return false;
        }
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
