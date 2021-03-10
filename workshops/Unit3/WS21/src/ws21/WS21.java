/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class WS21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        readProblem();
        Scanner input = new Scanner(System.in);

        int refrigeratorsGanga;
        System.out.println("Enter number of refrigeratorsGanga --> ");
        refrigeratorsGanga = input.nextInt();
        int refrigeratorMarcimex;
        System.out.println("Enter number of refrigeratorsMarcimex --> ");
        refrigeratorMarcimex = input.nextInt();
        int refrigeratOrForeignCompany;
        System.out.println("Enter number of refrigeratOrForeignCompany --> ");
        refrigeratOrForeignCompany = input.nextInt();

        int totalOfRefrigerators;

        totalOfRefrigerators = calculateNumbersOfRefrigerators(refrigeratorsGanga, refrigeratorMarcimex, refrigeratOrForeignCompany);
        System.out.print(refrigeratorsGanga + "+" + refrigeratorMarcimex + "-" + refrigeratOrForeignCompany +  "= " + totalOfRefrigerators);

    }

    public static void readProblem() {
        System.out.println(" Name: Erick Ochoa ");
        System.out.println("The company Ganga and Marcimex have a certain amount of refrigerators, these are added\n"
                + "What is the difference between the number of foreign refrigerators?");
    }

    public static int calculateNumbersOfRefrigerators(int RefrigeratorGanga, int RefrigeratorMarcimex, int refrigeratOrForeignCompany) {
        int totalOfNationalRefrigerators;
        int totalDifference;

        totalOfNationalRefrigerators = RefrigeratorGanga + RefrigeratorMarcimex;
        totalDifference = totalOfNationalRefrigerators - refrigeratOrForeignCompany;

        return totalDifference;
    }

}
