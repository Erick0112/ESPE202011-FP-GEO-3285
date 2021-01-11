/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mruvelocityshort;

/**
 *
 * @author Pc
 */
public class MRUvelocityShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    short dividend_metros; 
    short divisor_tiempo;
    short division; 
//a car makes a trip of 32766 m meters in an estimated time of 222 sec. How fast is it traveling? 

    dividend_metros= 32766;
    divisor_tiempo= 222;
   
      System.out.println("The division of" + dividend_metros + "/" + divisor_tiempo 
                 + "is esqual to -->" + (dividend_metros / divisor_tiempo));     
    
    }
    
}
