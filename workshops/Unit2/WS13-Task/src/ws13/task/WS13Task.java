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
        Scanner input = new Scanner(System.in);

        printBanner();
        float result;
        float area = 0;
        float majorbase;
        float minorbase;
        float altitude;
        float areaofpolygon;
        float numberofsides;
        float sides;
        float perimeter = 0;
        float apothem;
        float areaofcircle;
        float radio;
        float distance = 0;
        float initialvelocity;
        float time;
        float aceleration;
        float force = 0;
        float mass;
        float forces;
        float distances;

        float work = 0;

        System.out.println("TRAPEZOIDE AREA");
        System.out.println(" enter major base -->   ");
        majorbase = input.nextInt();
        System.out.println("enter minor base -->  ");
        minorbase = input.nextInt();
        System.out.println("enter altitude --> ");
        altitude = input.nextInt();
        result = computeTrapezoidArea(area, majorbase, minorbase, altitude);
        System.out.println("th area of trapezoid is--->" + result);

        System.out.println("REGULAR POLYGON AREA");
        System.out.println("enter number of sides --> ");
        numberofsides = input.nextInt();
        System.out.println("enter sides -->  ");
        sides = input.nextFloat();
        System.out.println(" enter the apotthem -->  ");
        apothem = input.nextFloat();
        areaofpolygon = computeRegularPolygonArea(area, numberofsides, sides, perimeter, apothem);
        System.out.println("the area og regula polygon is -->" + areaofpolygon);

        System.out.println("CIRCLE AREA");
        System.out.println("enter the radio --> ");
        radio = input.nextFloat();
        areaofcircle = computeCircleArea(area, radio);
        System.out.println("the area of circle is ->" + areaofcircle);

        System.out.println("FOMULA OF DISTANCE MRUV");
        System.out.println(" enter initial velocity --> ");
        initialvelocity = input.nextInt();
        System.out.println(" enter time --> ");
        time = input.nextInt();
        System.out.println(" enter initial aceleration --> ");
        aceleration = input.nextInt();
        distance = showFormulaOfDistance(distance, initialvelocity, time, aceleration);
        System.out.println("the distance traveled is --> " + distance);

        System.out.println("FORMULA OF FORCE");
        System.out.println(" enter mass --> ");
        mass = input.nextInt();
        System.out.println(" enter initial aceleration --> ");
        aceleration = input.nextInt();
        force = showFomulaOfForce(force, mass, aceleration);
        System.out.println(" the force is -->" + force);

        System.out.println("FORMULA OF WORK");
        System.out.println(" enter force --> ");
        forces = input.nextInt();
        System.out.println(" enter distance --> ");
        distances = input.nextInt();
        work = showFomulaOfWork(work, forces, distances);
        System.out.println(" the work is -->" + work);

    }

    public static void printBanner() {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n"
                + "|             UNIVERSIDAD DE LAS FUERZAS ARMADAS              |\n"
                + "|                         (ESPE)                              |\n"
                + "| Programming Fundamentals                                    |\n"
                + "| Programer: ERICK OCHOA                                      |\n"
                + "| WS13 TASK                                                   |\n"
                + "| CALCULATE TASK                                              |\n"
                + "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
    }

    public static float computeTrapezoidArea(float area, float majorbase, float minorbase, float altitude) {
        area = ((majorbase + minorbase) / 2) * altitude;
        return area;
    }

    public static float computeRegularPolygonArea(float area, float numberofsides, float sides, float perimeter, float apothem) {
        perimeter = numberofsides * sides;
        area = (perimeter * apothem) / 2;
        return area;
    }

    public static float computeCircleArea(float area, float radio) {
        area = (float) (Math.PI * Math.pow(radio, 2));

        return area;
    }

    public static float showFormulaOfDistance(float distance, float initialvelocity, float time, float aceleration) {
        distance = (float) (initialvelocity * time + 1 / 2 * aceleration * Math.pow(time, 2));

        return distance;

    }

    public static float showFomulaOfForce(float force, float mass, float aceleration) {
        force = mass * aceleration;
        return force;
    }

    public static float showFomulaOfWork(float work, float forces, float distances) {
        work = forces * distances;
        return work;

    }
}
