/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.boxingGym.controller;

import Utils.FileManager;
import ec.edu.espe.boxingGym.model.Fighter;

/**
 *
 * @author Pc
 */
public class FighterController {
    
    public void save(Fighter figther){
        
    String data = figther.getName()+ ";" + figther.getAge() + ";" + figther.getEconomicaProfit() + ";" + figther.isSeriousInjury() + ";" + figther.getWeight() ;
        FileManager.save(data, "Fighters");

    }
    
    public String  read(){
        String data;
        data = FileManager.read("fighters");
        return data;
    }

  

}

