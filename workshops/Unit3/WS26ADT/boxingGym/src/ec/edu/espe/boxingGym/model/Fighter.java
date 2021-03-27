/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.boxingGym.model;

/**
 *
 * @author Pc
 */
public class Fighter {
    private String name;
    private int age;
    private float economicaProfit;
    private boolean seriousInjury;
    private float weight; 

    public Fighter(String name, int age, float economicaProfit, boolean seriousInjury, float weight) {
        this.name = name;
        this.age = age;
        this.economicaProfit = economicaProfit;
        this.seriousInjury = seriousInjury;
        this.weight = weight;
    }

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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the economicaProfit
     */
    public float getEconomicaProfit() {
        return economicaProfit;
    }

    /**
     * @param economicaProfit the economicaProfit to set
     */
    public void setEconomicaProfit(float economicaProfit) {
        this.economicaProfit = economicaProfit;
    }

    /**
     * @return the seriousInjury
     */
    public boolean isSeriousInjury() {
        return seriousInjury;
    }

    /**
     * @param seriousInjury the seriousInjury to set
     */
    public void setSeriousInjury(boolean seriousInjury) {
        this.seriousInjury = seriousInjury;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
}
