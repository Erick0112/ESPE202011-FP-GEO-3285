/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n"
                + "|             UNIVERSIDAD DE LAS FUERZAS ARMADAS              |\n"
                + "|                         (ESPE)                              |\n"
                + "| Programming Fundamentals                                    |\n"
                + "| Programer: ERICK OCHOA                                      |\n"
                + "| HW11 Recursion                                              |\n"
                + "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter the number of the therms-->  ");
        number = input.nextInt();
        int sumofterms = 0;
        sumofterms = printTheSumOfTerms(number);

        System.out.println("The  sum of terms  is " + sumofterms);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
    }

    public static int printTheSumOfTerms(int numberofterms) {
        if (numberofterms == 1) {
            return 1;
        } else {
            return (numberofterms + printTheSumOfTerms(numberofterms - 1));

        }
    }
}
