/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws06iterations;

/**
 *
 * @author Pc
 */
public class WS06Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int i;
       i = 1;
        System.out.println("=== this a while loop from 1 to 29 ===="); 
        while( i <= 29 ){ 
            System.out.println("i -> " + i);
            i+=1;
                      
        }
              
        System.out.println("Multiplication Tables : 29");
        int top = 29; 
        int product = 0;
        int table = 29; 
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println(" 29* " + j + " = " + product);
        }
    
        System.out.println("sum table 20");
        int tops = 20; 
        int sum = 0;
         
        for (int j = 1; j <= tops ; j++  ){
            sum= tops  + j;
            System.out.println(" 20 + " + j + " = " + sum);
            
        }
        }
    }
  

             
    
    
