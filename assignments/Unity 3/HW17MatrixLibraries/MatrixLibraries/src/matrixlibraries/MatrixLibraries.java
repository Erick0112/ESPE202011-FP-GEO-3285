/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixlibraries;

import ec.edu.espe.matrix.BasicMatrixOperation;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float[][] a;
        float[][] b;
        float[][] c;
        
        int m = 0;
        int n = 0;
        int scalar =0;

        System.out.print("Enter the dimension of matrix ->");
        System.out.print("\n  m --> ");
        m = input.nextInt();
        System.out.print("\n n -->");
        n = input.nextInt();

        a = new float[m][n];
        b = new float[m][n];
        c = new float[m][n];
        
        
        System.out.println("Enter the elemts of matrix");
        a = BasicMatrixOperation.readMatrixElements(m, n, "A", input);
        b = BasicMatrixOperation.readMatrixElements(m, n, "B", input);

         System.out.println("---The subtract of matrices is---");
         c = BasicMatrixOperation.substractTwoMatrices (m, n, a, b);
        BasicMatrixOperation.prettyPrinMatrix(m, n, c);
       
        System.out.println("\n ---The sum of matrices is---");
        c = BasicMatrixOperation.addTwoMatrices(m, n, a, b);
        BasicMatrixOperation.prettyPrinMatrix(m, n, c);
        
        System.out.println("\n --- The Scalar product is ---");
        System.out.println("Enter the scalar");
        scalar = input.nextInt();
        c = BasicMatrixOperation.multiplyTwoMatrices(m, n, a, scalar);
        BasicMatrixOperation.prettyPrinMatrix(m, n, c);

    }

}
