/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;


/**
 *
 * @author Pc
 */
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    boolean mainLoop = true; 
    int option;
    do{
        System.out.print("====Calculator====");
        System.out.print("1. -> Multiplication  5 ");
        System.out.print("2. -> this a while loop ");
        System.out.print("3. -> square area ");
        System.out.print("4. ->first 10 Even numbers ");
        System.out.print("5. -> Exit");
        
        System.out.print("Enter your menu option --> ");
        option = input.nextInt();
        
        switch (option){
            case 1:
              System.out.print(" The multiplication 5 ");
                int multiplying;
                int multiplier = 5;
                int multiplication;
                 System.out.print("enter multiplying -> ");
                 multiplying = input.nextInt();
                 multiplication = multiplying * multiplier;
                 System.out.println("the multiplication is --> " + multiplication );
                 break;
                 
                
            case 2:
                System.out.println(" this a while loop ");
                int x;
                int i = 0;
                System.out.print(" enter x number --> ");
                x = input.nextInt();
                while( i <= x ){ 
                 System.out.println("i -> " + i);
                 i+=1;
                }
                break;
                
            case 3:
                System.out.println(" square area ");
                int side;
                int area;
                 System.out.println("enter side -> ");
                 side = input.nextInt();
                 area = side * side ;
                 System.out.println("the square area is -->"+ area);
                 break;
            case 4:
                System.out.println("first Even numbers");
                int t;
                i=2;
                System.out.println("enter number --> ");
                t = input.nextInt();
                while( i <= t ){ 
                System.out.println("is even  -> " + i);
                i+=2;
                }
                break;
                 case 5:
                    System.out.println(" Exit ");
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                    
                }
                } while (option != 5);
    }
}
    
            
        
