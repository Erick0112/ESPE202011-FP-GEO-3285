/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.functions;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n" + 
                "|             UNIVERSIDAD DE LAS FUERZAS ARMADAS              |\n"+
                "|                         (ESPE)                              |\n"+
                "| Programming Fundamentals                                    |\n"+
                "| Programer: ERICK OCHOA                                      |\n"+
                "| HW10 FUNCTIONS                                              |\n" +
                "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        System.out.println(" HELLO FRIEND BELOW YOU WILL SEE HOW TO SOLVE THE FOLLOWING FUNCTIONS XD ");
        Scanner input = new Scanner (System.in);
        int dividend ;
        int divisor ;
        System.out.println("Enter values ​​for the division \n"
                + " The  divididend is ---->  ");
        dividend = input.nextInt();
        System.out.println("The divisor is  ---->  ");
        divisor = input.nextInt();
        float outcome = 0;
        int variableX ;
        int variableY ;
        int base;       
        System.out.println("Enter enter a base to square --->  ");
        base = input.nextInt();
         int number;
         int result; 
        System.out.println("Enter number to resolve; number * number + 3 * number + 4 ---->  ");
        number = input.nextInt(); 
        
         int table;
         System.out.println("Enter the multiplication table you want to calculate ---> ");
          table = input.nextInt(); 
          int product;
          int multiplier = 1 ;
       
          System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");  
        outcome = divideTwoNumbers(dividend, divisor);
        System.out.println("outcome  -> " + outcome);

       
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        
        variableY = elevatetosquare(base);
        System.out.println(base + "^2 -> " + variableY);

      
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
      
        variableY = elevatetosquare(-base);
        System.out.println(-base + "^2 -> " + variableY);

     
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

      variableX = -1;
        variableY = elevatetosquare(variableX);
        System.out.println("the square of -> " + variableX + " <- is equal to -> " + variableY);
        
      
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        result = computeParabola (number);
        System.out.println("Result of " + number + "*" + number + " + 3 * " + number + " + 4 ---> "+ result );
        
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        product = ShowTheMultiplicationTables(table); 
       
       
    }
    

    public static float divideTwoNumbers(int dividend, int divisor) {
        float quotient = 0.0F;
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int elevatetosquare(int base) {
        int variabley = 0;
      
        variabley = base * base  ;

        return variabley;
    }

    public static int computeParabola(int number) {
        int result = 0;

        result = number * number + 3 * number + 4;

        return result;
    }
   
    public static int ShowTheMultiplicationTables (int table ) {
          
        int product = 0;
        int multiplier;
        for (multiplier = 1; multiplier <= 12; multiplier++) {
            
         product = table * multiplier;
       System.out.println( table + " * " + multiplier + " = " + product);
        }
        return product;
    }
}
        
             
    
   
