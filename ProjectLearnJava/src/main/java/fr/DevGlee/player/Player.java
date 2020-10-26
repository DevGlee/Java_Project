/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.player;

/**
 *
 * @author DevGlee
 */
public class Player {
    
    private String name;
    private double pv;
    private double pa;
    
  
    public Player(String name, double pa, double pv) {
        this.name=name;
        this.pa=pa;
        this.pv=pv;
    }

        
    public void damage(double damage){
        this.pv-=damage;
    }
    
    // METHODES
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the pv
     */
    public double getPv() {
        return pv;
    }

    /**
     * @param pv the pv to set
     */
    public void setPv(double pv) {
        this.pv = pv;
    }

    /**
     * @return the pa
     */
    public double getPa() {
        return pa;
    }

    /**
     * @param pa the pa to set
     */
    public void setPa(double pa) {
        this.pa = pa;
    }
}
