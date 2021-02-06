/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11functions;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class WS11FUNCTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
         System.out.println("||||||||| Embedded Structures||||||||  ");
        System.out.println(" programmers:\n Ochoa Erick\n"
                + " Portero Carla\n"
                + " Pilataxi Kyara\n"
                + " Villalba Alessio\n"
                + " Yaguana Kevin\n\n ");
        Scanner scanner = new Scanner(System.in);
        float operand1;
        float operand2;
        float product;
        float division;
        float addition;
        float modulus;
        char option;
        int paramOperand1 = 0;
        int paramOperand2 = 0;
        
        do {
            System.out.print("Enter operand1 --> ");
            operand1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter operand2 -->  ");
            operand2 = scanner.nextInt();
            scanner.nextLine();

            if (operand1 % 2 == 0 && operand2 % 2 == 0) {
                product = operand1 * operand2;
                System.out.println(operand1 + " x " + operand2 + " = " + product);
            } else if (operand1 % 3 == 0 && operand2 % 3 == 0) {
                addition = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + addition);
            } else if (operand1 % 7 == 0 && operand2 % 7 == 0) {
                modulus = operand1 % operand2;
                System.out.println(operand1 + " % " + operand2 + " = " + modulus);
            } else if (operand1 % 11 == 0 && operand2 % 11 == 0) {
                showMultilplicationTables( paramOperand1, paramOperand2 );
            } else if (operand1 % 13 == 0 && operand2 % 13 == 0) {
                division = (operand1 / operand2);
                System.out.println(operand1 + " / " + operand2 + " = " + division);
            } else {
                System.out.println("The operation is not recognized");
                System.out.println("The operation not exist");
            }

            System.out.println();
            System.out.println();
            System.out.println("Do you want retry again? [y/n]");
            option = scanner.nextLine().charAt(0);
        } while (option != 'n');
    }
public static void showMultilplicationTables(int paramOperand1,int paramOperand2 ){
    
    for (int i = 1; i <= 12; i++) {
                    System.out.println(paramOperand1 + " x " + i + " = " + (1 * i));
                }

                if (paramOperand1 != paramOperand2) {
                    for (int i = 1; i <= 12; i++) {
                        System.out.println(paramOperand2 + " x " + i + " = " + (paramOperand2 * i));
                    }
                }  
} 
}


    
    

