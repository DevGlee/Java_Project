/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.car;

/**
 *
 * @author DevGlee
 */
public abstract class Car {
    
    private String model;
    private double weight;
    private double reservoir;
    private int horsepower;
    private String fuel;
    
 public Car(String model, double weight, double reservoir, int horsepower, String fuel){
     this.model=model;
     this.weight=weight;
     this.reservoir=reservoir;
     this.horsepower=horsepower;
     this.fuel=fuel;
 }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the reservoir
     */
    public double getReservoir() {
        return reservoir;
    }

    /**
     * @param reservoir the reservoir to set
     */
    public void setReservoir(double reservoir) {
        this.reservoir = reservoir;
    }

    /**
     * @return the horsepower
     */
    public int getHorsepower() {
        return horsepower;
    }

    /**
     * @param horsepower the horsepower to set
     */
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    /**
     * @return the fuel
     */
    public String getFuel() {
        return fuel;
    }

    /**
     * @param fuel the fuel to set
     */
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
 
 
    
}
