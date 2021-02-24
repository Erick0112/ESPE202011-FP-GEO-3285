/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n"
                + "|             UNIVERSIDAD DE LAS FUERZAS ARMADAS              |\n"
                + "|                         (ESPE)                              |\n"
                + "| Programming Fundamentals                                    |\n"
                + "| Programer: ERICK OCHOA                                      |\n"
                + "| HW12 TAXES                                                  |\n"
                + "| CALCULATE TAXES                                             |\n"
                + "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        int[][] a;
        int[][] b;
        int[][] c;
        int m = 0;
        int n = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimension of matrix ->");
        System.out.print("\n  m --> ");
        m = input.nextInt();
        System.out.print("\n n -->");
        n = input.nextInt();

        a = new int[m][n];
        b = new int[m][n];
        c = new int[m][n];

        System.out.println("Enter the elements of matrix");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" Enter the element a[" + (i + 1) + "][" + (j + 1) + "] --> ");
                a[i][j] = input.nextInt();

            }
        }
        System.out.println(" Matrix A ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" \n Enter the element b [" + (i + 1) + "][" + (j + 1) + "] --> ");
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix B");
        for (int i = 0; i < m; i++) {
            System.out.println(" ");
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + "\t");
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("\n C equals to -> ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + "\t ");
            }
        }
    }
}
