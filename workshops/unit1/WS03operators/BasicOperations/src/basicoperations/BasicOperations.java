/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author Pc
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum; 
        int addend1;
        int addend2;
        
        addend1 = 5;
        addend2 = 18;
        
         sum = addend1 + addend2;
         
        System.out.println(" The addition of " + addend1 + " + " + addend2 
                + " is equal to --> " + sum ); 
        System.out.println("sum is equal to -->" + sum );
        ++sum;
        System.out.println("sum is equal to -->" + sum);
        
             sum++;
        System.out.println("sum is equal to -->" + sum);
        System.out.println("adding one to sum" + (sum++));
        System.out.println("adding one to sum" + ((++sum))); 
         
        
        int minuend; 
        int subtrahend;
        int difference; 
        
        minuend = -23;
        subtrahend = -6; 
        
        System.out.println("the subtraction of" + minuend + " - " + subtrahend 
                + "is equal to" + (minuend - subtrahend));
       
        
        int multiplying;
        int multiplier;
        int multiplication; 
        
        multiplying = 5;
        multiplier = 5;
        
         System.out.println("The multiplication of" + multiplying + "*" 
                 + multiplier + "is equal to -->" + (multiplying * multiplier));
        int dividend;
        int divisor;
        int division;
        
        dividend = 50;
        divisor = 5;
        
         System.out.println("The division of" + dividend + "/" + divisor 
                 + "is esqual to -->" + (dividend / divisor) ); 
        
        
        int modulus;
         System.out.println("The modulus of" + dividend + "%" + divisor 
                 + "is esqual to -->" + (dividend % divisor) );
       
        
    }    
    
}
