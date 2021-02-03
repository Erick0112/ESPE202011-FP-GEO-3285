/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws10functions;

/**
 *
 * @author Pc
 */
public class WS10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int dividend = 6;
        int divisor = 11;
        float outcome = 0;
        int x = 0;
        int y = 0;

        outcome = divideTwoNumbers(dividend, divisor);

        System.out.println("outcome of 6 and 11 is -> " + outcome);

        y = f(8);
        System.out.println("8^2 -> " + y);

        y = f(-8);
        System.out.println("-8^2 -> " + y);

        x = -1;
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

    }

    public static float divideTwoNumbers(int dividend, int divisor) {
        float quotient = 0.0F;
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 3 * x + 4;

        return y;
    }

}
