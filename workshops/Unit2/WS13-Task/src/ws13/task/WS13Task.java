/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class WS13Task {

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
                + "| WS13 TASK                                                  |\n"
                + "| CALCULATE TAXES                                             |\n"
                + "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        float result;
        float area = 0;
        float areaofpolygon;
        float areaofcircle;
        float formula = 0;
        float distance;
        float force;
        float work;
        System.out.println("TRAPEZOIDE AREA");
        result = showTrapezoidArea(area);
        System.out.println("th area of trapezoid is--->" + result);

        System.out.println("REGULAR POLYGON AREA");
        areaofpolygon = showRegularPolygonArea(area);
        System.out.println("the area og regula polygon is -->" + areaofpolygon);

        System.out.println("CIRCLE AREA");
        areaofcircle = showCircleArea(area);
        System.out.println("the area of circle is ->" + areaofcircle);

        System.out.println("FOMULA OF DISTANCE MRUV");
        distance = showFormulaOfDistance(formula);
        System.out.println("the distance traveled is --> " + distance);

        System.out.println("FORMULA OF FORCE");
        force = showFomulaOfForce(formula);
        System.out.println(" the force is -->" + force);

        System.out.println("FORMULA OF WORK");
        work = showFomulaOfWork(formula);
        System.out.println(" the work is -->" + work);

    
    
    }

    public static float showTrapezoidArea(float area) {
        Scanner input = new Scanner(System.in);
        float majorbase;
        float minorbase;
        float altitude;
         System.out.println(" enter major base -->   ");
        majorbase= input.nextInt();
        System.out.println("enter minor base -->  ");
        minorbase= input.nextInt();
        System.out.println("enter altitude --> ");
        altitude = input.nextInt();
        area = (( majorbase + minorbase)/2) * altitude;
        return area;
    }
    
     public static float showRegularPolygonArea(float area){
        Scanner input = new Scanner(System.in);
         float numberofsides;
         float sides;
         float perimeter;
         float apothem;
   

         System.out.println("enter number of sides --> ");
         numberofsides = input.nextInt(); 
         System.out.println("enter sides -->  ");
         sides = input.nextFloat();
         perimeter = numberofsides * sides;
        
         System.out.println(" enter the apotthem -->  ");
         apothem = input.nextFloat();
         
         area = (perimeter * apothem)/ 2;
         return area;
     }


   public static float showCircleArea(float area){
        Scanner input = new Scanner(System.in);
        float radio;
        System.out.println("enter the radio --> ");
        radio = input.nextFloat();
        
        area = (float) (Math.PI * Math.pow(radio , 2));
    
return area;
}
   
   public static float showFormulaOfDistance(float distance){
       Scanner input = new Scanner (System.in);
       float initialvelocity;
       float time;
       float aceleration; 
        System.out.println(" enter initial velocity --> ");
        initialvelocity = input.nextInt();
        System.out.println(" enter time --> ");
        time = input.nextInt();
        System.out.println(" enter initial aceleration --> ");
        aceleration = input.nextInt();
        
        distance= (float) (initialvelocity * time + 1/2 * aceleration * Math.pow(time, 2));
        
return distance;
 
  }
   public static float showFomulaOfForce(float force){
        Scanner input = new Scanner (System.in);
        float mass;
        float aceleration;
        
        System.out.println(" enter mass --> ");
        mass = input.nextInt();
        System.out.println(" enter initial aceleration --> ");
        aceleration = input.nextInt();
        force = mass * aceleration;
        return force;
   }
   public static float showFomulaOfWork(float work){
        Scanner input = new Scanner (System.in);
        float force;
        float distance;
        
        System.out.println(" enter force --> ");
        force = input.nextInt();
        System.out.println(" enter distance --> ");
        distance = input.nextInt();
        work = force * distance;
        return work;
   
   
   } 
}



