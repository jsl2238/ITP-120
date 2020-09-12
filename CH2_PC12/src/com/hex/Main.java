package com.hex;

//*********************************************************
//*     @author      Jonathan Lester
//*     Date         9/14/2020
//*     Purpose      Manipulate strings in various ways
//*********************************************************

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);                                                                      //Defining the Scanner object with the name of "keyboard"
        final String CITY_NAME, CITY_UPPER, CITY_LOWER, OUTPUT;                                                         //Defining variables that will store the name and variations
        final int NUM_CHARS_IN_NAME;                                                                                    //Defining the variable for how many characters in name
        final char FIRST_CITY_CHAR;                                                                                     //Defining the variable for the first character

        System.out.println("Please enter your favorite city: ");

        CITY_NAME = keyboard.nextLine();                                                                                //Get the user's input to CITY_NAM
        CITY_UPPER = CITY_NAME.toUpperCase();                                                                           //Turn city's name to uppercase and store it
        CITY_LOWER = CITY_NAME.toLowerCase();                                                                           //Turn city's name to lowercase and store it
        FIRST_CITY_CHAR = CITY_NAME.charAt(0);                                                                          //Get the first character in the city's name and store it

        if (CITY_NAME.contains(" ")) {                                                                                  //Check if there's whitespace in the name of the city
            String name = CITY_NAME.replaceAll("\\s", "");                                              //If there is, remove the whitespace
            NUM_CHARS_IN_NAME = name.length();                                                                          //and then save the new length to NUM_CHARS_IN_NAME
        } else {                                                                                                        //Otherwise
            NUM_CHARS_IN_NAME = CITY_NAME.length();                                                                     //Store the name of the city in NUM_CHARS_IN_NAME
        } //End if statement for checking whitespace

        System.out.println("City name: " + CITY_NAME +                                                                  //Print out city name
                           "\nNumber of characters in the city's name: " + NUM_CHARS_IN_NAME +                          //Print out the number of character's in the variable CITY_NAME
                           "\nCity name to uppercase: " + CITY_UPPER +                                                  //Print out city's name in uppercase
                           "\nCity name to lowercase: " + CITY_LOWER +                                                  //Print out city's name in lowercase
                           "\nFirst character in the city's name: " + FIRST_CITY_CHAR);                                 //Print out the first character in CITY_NAME
    } // end main
} // end class
