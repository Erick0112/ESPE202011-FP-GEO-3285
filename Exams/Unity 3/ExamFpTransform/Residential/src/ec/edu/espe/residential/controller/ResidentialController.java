/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.residential.controller;

import Utils.FileManager;
import ec.edu.espe.residential.Model.House;

/**
 *
 * @author Pc
 */
public class ResidentialController {
    
    
     public void save(House house){
        
    String data = house.getNumberOfHouse()+ ";" + house.isHouseSize()+ ";" + house.getNumberofRooms()+ ";" + house.getHouseColor() + ";" + house.getMaximumOfPeople();
         FileManager.save(data, "Residential");
      
         

    }
     public String  read(){
        String data;
        data = FileManager.read("Houses");
        return data;
    }
}
