/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysquiz.pkg22th.february;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ArraysQuiz22thFebruary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
       
         int option;
        do {
            System.out.println("Candidates Names with pecentage");
             Scanner input = new Scanner(System.in);
         option = input.nextInt();
         
       
        String [] candidatesNames = {"Arauz","Lasso", "Yaku"}; 
         int[] namesCandidates;  
         System.out.println("Enter the candidate ");
          float [] votesPercentage = { 31.74F,20.05F, 19.85F} ;
        int number;
        System.out.println("enter number");
          number = input.nextInt();
          namesCandidates= new int [number];
          for (String candidatesNames : candidatesNames ){
            System.out.println(" Names of candidates ->" + candidatesNames);
           
        
         
         
        }
        
    }
    
}

  int n;
        System.out.println("Enter the number of the candidates -> ");
        n = input.nextInt();
        candidatesName = new int[n];        

        for (String candidates : candidates) {
            System.out.println("candidates name -> " + candidates);
        }
        for (int i = 0; i < percentageOfCandidates.length ; i++) {
            System.out.println("percentage of candidates " + (i + 1) + " -> " + percentageOfCandidates[i]);  
