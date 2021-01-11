/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws04logicaloperators;

/**
 *
 * @author Pc
 */
public class WS04LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int x = 9;
        if (x != 9) {
            System.out.println("x is equals to 9");
        } else {
            System.out.println("x is NOT equal to 9");
        }

        boolean y = x != 9;
        System.out.println("x != 9 --> " + (y));
        System.out.println("x == 9 --> " + (x == 9));
        System.out.println("x = 6 -->   " + (x = 6));
        System.out.println("x > 6 -->  " + (x > 6));
        System.out.println("x >= 6 --> " + (x >= 6));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 9;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 6;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

        
        
      
         System.out.println("Erick Ochoa AND TRUTH TABLE odd numbers -> && even numbers ->||"); 
         System.out.println("================================================");
        boolean d;
        boolean m;
        d = true; 
        m = true;        
        System.out.println(" ( " + d + " ^ " + m + " ) " + (d && m));
        
        d= true; 
        m= false; 
        System.out.println(" ( " + d + " ^ " + m + " ) " + (d && m));
        
        d = false; 
        m = true; 
        System.out.println(" ( " + d + " ^ " + m + " ) " + (d && m));
        
        d = false;
        m = false;
        System.out.println(" ( " + d + " ^ " + m + " ) " + (d && m));
    }
    
}
