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
           
                  
        
        
        
        
        
    
            


    int totalOfCandidates = 0;
        String[] candidates;
        float [] porcentageOfVotes;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of candidates to want  ->");
        totalOfCandidates = scanner.nextInt();

        candidates = new String[totalOfCandidates];
        porcentageOfVotes = new float[totalOfCandidates];

        for (int i = 0; i < totalOfCandidates; i++) {
            scanner.nextLine();
            System.out.print("Please enter the name of candidates" + i + "->");
            candidates[i] = scanner.nextLine();
            System.out.print("Please enter" + candidates[i] + "porcentage of votes - >");
            porcentageOfVotes[i] = scanner.nextFloat();
        }
        System.out.println(" Candidate -> \t porcentage of votes ");
        for (int i = 0; i < totalOfCandidates; i++) {
            System.out.println(candidates[i] + "-> \t " + porcentageOfVotes[i]);
        }
          }
        }
        
        }
        

          int totalOfCandidates = 0;
        String[] candidates;
        float [] porcentageOfVotes;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of candidates to want  ->");
        totalOfCandidates = scanner.nextInt();

        candidates = new String[totalOfCandidates];
        porcentageOfVotes = new float[totalOfCandidates];

        for (int i = 0; i < totalOfCandidates; i++) {
            scanner.nextLine();
            System.out.print("Please enter the name of candidates" + i + "->");
            candidates[i] = scanner.nextLine();
            System.out.print("Please enter" + candidates[i] + "porcentage of votes - >"+"%");
            porcentageOfVotes[i] = scanner.nextFloat();
        }
        System.out.println(" Candidate -> \t porcentage of votes ");
        for (int i = 0; i < totalOfCandidates; i++) {
            System.out.println(candidates[i] + "-> \t " + porcentageOfVotes[i] + "%");
        }

    }
}



      