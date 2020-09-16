package com.hex;

//************************************************************************
//*     @author     Jonathan lester
//*     Date        9/20/20
//*     Purpose     Sales Taxes
//************************************************************************

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch2_PC7_Lester //don't forget class starts with a cap and be sure to follow the naming requirments
{

   public static void main(String[] args)
   {
       final double STATE_TAX, TOTAL_STATE_TAX, COUNTY_TAX, TOTAL_COUNTY_TAX,
                    TOTAL_TAX, TOTAL_SALE_PRICE, AMOUNT_OF_PURCHASE;                                                    //Define all doubles
       final String DATE_OF_PURCHASE;                                                                                   //Define all String

        Scanner input = new Scanner(System.in);                                                                         //Defining the Scanner
        DecimalFormat df = new DecimalFormat("#.##");                                                            //Defining the DecimalFormat for rounding

        STATE_TAX = 0.04;                                                                                               //Initializing STATE_TAX
        COUNTY_TAX = 0.02;                                                                                              //Initializing COUNTY_TAX

        System.out.print("What was the amount of your purchase: ");                                                     //Ask user for the amount of their purchase
        AMOUNT_OF_PURCHASE = Double.parseDouble(input.nextLine());                                                      //Get the user input as a string and then parse it as a double
        System.out.print("\nWhat was the date of your purchase: ");                                                     //Ask user the date of their purchase
        DATE_OF_PURCHASE = input.nextLine();                                                                            //Get the date of the purchase as a String

       TOTAL_STATE_TAX = STATE_TAX * AMOUNT_OF_PURCHASE;                                                                //Calculate the total state tax
       TOTAL_COUNTY_TAX = COUNTY_TAX * AMOUNT_OF_PURCHASE;                                                              //Calculate the total county tax
       TOTAL_TAX = Double.parseDouble(df.format(TOTAL_STATE_TAX + TOTAL_COUNTY_TAX));                            //Calculate the total of the taxes with rounding
       TOTAL_SALE_PRICE = Double.parseDouble(df.format((TOTAL_TAX * AMOUNT_OF_PURCHASE) + AMOUNT_OF_PURCHASE));  //Calculate the total sale price while using the DecimalFormat to round

        System.out.print("\n\nDate of Sale:  " + DATE_OF_PURCHASE);                                                     //Print out the date
        System.out.print("\n");                                                                                         //Leave a blank space
        System.out.print("\nAmount of Purchase:  " +  "$" + AMOUNT_OF_PURCHASE);                                        //The amount of the purchase
        System.out.print("\nState Sales Tax:        " + STATE_TAX);                                                     //State sales tax as a percentage
        System.out.print("\nCounty Sales Tax:       " + COUNTY_TAX);                                                    //County sales tax as a percentage
        System.out.print("\nTotal Tax:            " + "$" + TOTAL_TAX);                                                 //The total amount of taxes having to be paid
        System.out.print("\n____________________________");                                                             //A line break
        System.out.print("\nTotal Sale:        " + "$" + TOTAL_SALE_PRICE);                                             //Print the total sale price

   } // end main

} // end class