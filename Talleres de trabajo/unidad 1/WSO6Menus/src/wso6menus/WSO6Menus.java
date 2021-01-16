/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wso6menus;

/**
 *
 * @author Pc
 */
public class WSO6Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> difference");
            System.out.println("2. -> addition");
            System.out.println("3. -> division");
            System.out.println("4. -> multiplication");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                   int minuend; 
                   int subtrahend;
                   int difference;
                    System.out.println("enter minuend -> ");
                    minuend = input.nextInt();
                    System.out.println("subtrahend -> ");
                    subtrahend = input.nextInt();
                    difference = minuend - subtrahend;
                    System.out.println(" the difference is --> " + difference);
                    break;
                case 2:
                    System.out.println("The sum is");
                     int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" the sum is --> " + sum);
                    break;
                case 3:
                    System.out.println("The division is");
                     int dividend;
                     int divisor;
                     int division;
                      System.out.println("enter dividend  -> ");
                    dividend = input.nextInt();
                    System.out.println("enter divisor -> ");
                    divisor = input.nextInt();
                    division = dividend / divisor;
                    System.out.println(" the division is --> " + division);
                    break;
                case 4:
                    System.out.println("The multiplication is");
                      int multiplying;
                      int multiplier;
                      int multiplication;
                      System.out.println("enter multiplying  -> ");
                    multiplying = input.nextInt();
                    System.out.println("enter multiplier -> ");
                    multiplier = input.nextInt();
                    multiplication = multiplying / multiplier;
                    System.out.println(" the multiplication is --> " + multiplication);
                        break;
                case 5:
                    System.out.println("Good Bye my Brother");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);
    }
    
}
