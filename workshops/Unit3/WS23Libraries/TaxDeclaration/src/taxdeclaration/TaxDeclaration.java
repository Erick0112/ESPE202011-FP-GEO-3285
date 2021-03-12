/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxdeclaration;

import ec.edu.espe.taxes.BasicTax;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class TaxDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        float price;
        float totalPrice;
        final float ivaPercentage = 12;
        float ivaValue;
        Scanner input = new Scanner(System.in);
        System.out.println("----Erick Ochoa Taxes----");
        System.out.println(" IVA  -->");
        System.out.println("Enter the price of your products ");
        price= input.nextFloat();
      ivaValue=BasicTax.computeIva(price, ivaPercentage);
      totalPrice = price + ivaValue;
        System.out.println("total price ->" + totalPrice);
    }
    
}
