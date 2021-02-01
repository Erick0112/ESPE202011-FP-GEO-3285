/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08.factorialnumber;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("FACT!");
        int fact = 1;
        int variable;

        System.out.println("enter the variable to know the factorial ---->  ");
        variable = input.nextInt();
        if (variable <= 15) {

            for (int i = 1; i <= variable; i++) {
                fact *= i;

                System.out.println(" The fact of " + variable + " is " + fact);

            }
        } else {
            System.out.println("Numbers greater than 15 are not recognized!");
        }

    }
}
