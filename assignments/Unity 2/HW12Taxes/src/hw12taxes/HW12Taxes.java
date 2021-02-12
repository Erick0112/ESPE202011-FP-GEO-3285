/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12taxes;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n"
                + "|             UNIVERSIDAD DE LAS FUERZAS ARMADAS              |\n"
                + "|                         (ESPE)                              |\n"
                + "| Programming Fundamentals                                    |\n"
                + "| Programer: ERICK OCHOA                                      |\n"
                + "| HW12 TAXES                                                  |\n"
                + "| CALCULATE TAXES                                             |\n"
                + "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

        float basicfraction;
        float taxonthebasicfraction;
        float surplusfractiontax;
        float value;
        float VAT;
        float IDS1;
        float IDS2;
        float IDS3;
        float number1;
        float number2;
        float number3;

        System.out.println("INCOME TAX");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        System.out.println("enter de Basic Fraction --> ");
        basicfraction = input.nextInt();
        taxonthebasicfraction = getBasicFractionTax(basicfraction);
        System.out.println("the Tax On The Basic Fraction is -->" + taxonthebasicfraction);

        surplusfractiontax = getSurplusFractionTax(basicfraction);
        System.out.println("the surplus fraction tax is --->" + surplusfractiontax);

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        System.out.println("INCOME VAT");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        System.out.println("enter the Value of VAT ---> ");
        value = input.nextInt();
        VAT = showVATTax(value);
        System.out.println("the VAT = -->  " + VAT);

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        System.out.println("IDS\n");
        System.out.println("enter the number1 > 1200 to calculate the tax (IDS) Transfer of money abroad --> ");
        number1 = input.nextInt();
        IDS1 = showTransferOfMoneyAbroad(number1);
        System.out.println("the IDS1 to transfer of money abroad is -->" + IDS1);

        System.out.println("Enter the number2 > 5017.33 to calculate the tax(IDS) for International transfers and currency shipping --> ");
        number2 = input.nextInt();
        IDS2 = showInternationalTransfersAndSendingCurrency(number2);
        System.out.println("the IDS2 for International transfers and currency shippingis is-->" + IDS2);

        System.out.println("enter the number3 to calculate the tax (IDS) for public shows --> ");
        number3 = input.nextInt();
        IDS3 = showPublicShows(number3);
        System.out.println("the IDS3 for Public Shows is -->" + IDS3);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("It is the duty of every citizen to pay taxes, goodbye ;)");
    }

    private static float getBasicFractionTax(float basicfraction) {

        if (basicfraction > 0 && basicfraction <= 14285) {
            return 0;
        } else if (basicfraction >= 14285 && basicfraction < 17854) {
            return 154;
        } else if (basicfraction >= 17854 && basicfraction < 21442) {
            return 511;
        } else if (basicfraction >= 21442 && basicfraction < 42874) {
            return 941;
        } else if (basicfraction >= 42874 && basicfraction < 64297) {
            return 4156;
        } else if (basicfraction >= 64297 && basicfraction < 85729) {
            return 8440;
        } else if (basicfraction >= 85729 && basicfraction < 114288) {
            return 13798;
        } else {
            return 22366;
        }
    }

    private static float getSurplusFractionTax(float basicfraction) {
        float surplusfractiontax;
        float resultvalor;
        if (basicfraction > 0 && basicfraction < 14285) {
            surplusfractiontax = ((basicfraction - 14285) * 10) / 100;
            resultvalor = basicfraction + surplusfractiontax;
            return resultvalor;
        } else if (basicfraction > 14285 && basicfraction < 17854) {
            surplusfractiontax = ((basicfraction - 14285) * 10) / 100;
            resultvalor = basicfraction + surplusfractiontax;
            return resultvalor;
        } else if (basicfraction >= 17854 && basicfraction < 21442) {
            surplusfractiontax = ((basicfraction - 17854) * 10) / 100;
            resultvalor = basicfraction + surplusfractiontax;
            return resultvalor;
        } else if (basicfraction >= 21442 && basicfraction < 42874) {
            surplusfractiontax = ((basicfraction - 21442) * 10) / 100;
            resultvalor = basicfraction + surplusfractiontax;
            return resultvalor;
        } else if (basicfraction >= 42874 && basicfraction < 64297) {
            surplusfractiontax = ((basicfraction - 42874) * 10) / 100;
            resultvalor = basicfraction + surplusfractiontax;
            return resultvalor;
        } else if (basicfraction >= 64297 && basicfraction < 85729) {
            surplusfractiontax = ((basicfraction - 64297) * 10) / 100;
            resultvalor = basicfraction + surplusfractiontax;
            return resultvalor;
        } else if (basicfraction >= 85729 && basicfraction < 114288) {
            surplusfractiontax = ((basicfraction - 85729) * 10) / 100;
            resultvalor = basicfraction + surplusfractiontax;
            return resultvalor;
        } else {
            surplusfractiontax = ((basicfraction - 114288) * 10) / 100;
            resultvalor = basicfraction + surplusfractiontax;
            return resultvalor;
        }
    }

    private static float showVATTax(float value) {
        float VAT;
        VAT = (value * 12) / 100;
        return VAT;

    }

    private static float showTransferOfMoneyAbroad(float value) {
        float ISD;
        if (value > 1200) {
            ISD = (float) ((value - 1200) * 0.05);
            return ISD;
        } else {
            return 0;
        }
    }

    private static float showInternationalTransfersAndSendingCurrency(float value) {
        float ISD;
        if (value > 5017.33) {
            ISD = (float) ((value - 5017.33) * 0.05);
            return ISD;
        } else {

        }
        return 0;
    }

    private static float showPublicShows(float value) {
        float ISD;
        ISD = (float) ((value * 0.05));
        return ISD;

    }

}
