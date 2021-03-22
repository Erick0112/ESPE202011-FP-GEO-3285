/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingmenu;

import ec.edu.espe.search.BasicSearch;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class SearchingMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Programmer: Erick Ochoa ");
     Scanner input = new Scanner(System.in);   
     int leapYears[] = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036 ,2040 };
     int n = leapYears.length;
     int element;
     int result;
     
        System.out.println("----Linear search----");
        System.out.print("enter the leap year (2000 -2040)  you want to know --->");
        element = input.nextInt();
        result = BasicSearch.search(leapYears, element);
        if (result == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Index -->" + result);
        }
            System.out.println("---Binary search----");
             System.out.print("enter the number you want to know ---> ");
        element = input.nextInt();
        result = BasicSearch.binarySearch(leapYears, 0, n - 1, element);
        if (result == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Index -->" + result );
            
        }
        }
    }
    
    

