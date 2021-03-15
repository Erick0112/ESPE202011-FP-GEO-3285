/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16.matrixfunction;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class HW16MatrixFunction {

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
                + "| HW16                                                        |\n"
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

       a = readMatrixElements(m, n, "A", input);
        b = readMatrixElements(m, n, "B", input);

        for (int tab = 0; tab <= m / 2; tab++) {
            System.out.println("\t");
        }
        
        
        
        System.out.println("---The sum of matrices is---");

        c = substractTwoMatrices(m, n, a, b);

       
        System.out.println(c);
    
        
        
        
        
    }
    
      public static int[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
       int[][] matrix;
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("---Elemts numbers " + (i + 1) + "---");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "] [" + (j + 1) + "] -> ");
                matrix[i][j] = input.nextInt();
      }
}  return matrix;
      }

 public static int[][] substractTwoMatrices(int m, int n, int[][] a, int[][] b) {
        int[][] c;
        c = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }
}



    
    

