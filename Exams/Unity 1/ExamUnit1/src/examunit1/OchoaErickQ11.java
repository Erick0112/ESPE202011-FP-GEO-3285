/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examunit1;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class OchoaErickQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System.in);
    boolean mainLoop = true; 
    int option;
   
    do{
     System.out.println("Enter the table that you want the study.(0) for  exit --> ");
     option = input.nextInt();
     
        switch (option){
                       
             case 6:
        int top = 12; 
        int product;
        int table;
        System.out.println (" Multiplication tables: " );
        table = input.nextInt();
        for (int j = 1 ; j <= 12 ; j++){
            product = table * j;
            System.out.println( table + " * " + j + " = " + product);
            
        }
            break;
                 case 0:            
                     System.out.println(" -> Good Bye <- ");

                    System.exit(0);
                    break;
                    default:
                    System.out.println("Invalid option\n\n\n");
                    break;
        }
    }while (option != 0);
    }
    }
    
    

