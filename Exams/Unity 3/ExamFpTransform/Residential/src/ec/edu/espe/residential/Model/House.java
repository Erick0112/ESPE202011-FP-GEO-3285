/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.residential.Model;

/**
 *
 * @author Pc
 */
public class House {
    private int numberOfHouse;
     private boolean houseSize;
     private int numberofRooms;
     private String houseColor;
     private int maximumOfPeople;

    public House(int numberOfHouse, boolean houseSize, int numberofRooms, String houseColor, int maximumOfPeople) {
        this.numberOfHouse = numberOfHouse;
        this.houseSize = houseSize;
        this.numberofRooms = numberofRooms;
        this.houseColor = houseColor;
        this.maximumOfPeople = maximumOfPeople;
    }

    /**
     * @return the numberOfHouse
     */
    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    /**
     * @param numberOfHouse the numberOfHouse to set
     */
    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    /**
     * @return the houseSize
     */
    public boolean isHouseSize() {
        return houseSize;
    }

    /**
     * @param houseSize the houseSize to set
     */
    public void setHouseSize(boolean houseSize) {
        this.houseSize = houseSize;
    }

    /**
     * @return the numberofRooms
     */
    public int getNumberofRooms() {
        return numberofRooms;
    }

    /**
     * @param numberofRooms the numberofRooms to set
     */
    public void setNumberofRooms(int numberofRooms) {
        this.numberofRooms = numberofRooms;
    }

    /**
     * @return the houseColor
     */
    public String getHouseColor() {
        return houseColor;
    }

    /**
     * @param houseColor the houseColor to set
     */
    public void setHouseColor(String houseColor) {
        this.houseColor = houseColor;
    }

    /**
     * @return the maximumOfPeople
     */
    public int getMaximumOfPeople() {
        return maximumOfPeople;
    }

    /**
     * @param maximumOfPeople the maximumOfPeople to set
     */
    public void setMaximumOfPeople(int maximumOfPeople) {
        this.maximumOfPeople = maximumOfPeople;
    }
     
}
