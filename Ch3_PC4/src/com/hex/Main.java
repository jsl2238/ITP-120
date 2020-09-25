package com.hex;

//************************************************************************
//*     @author     Jonathan lester
//*     Date        9/20/20
//*     Purpose     Test Scores and Grades
//************************************************************************

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Housekeeping
        final char[] GRADELETTERS = new char[5];                                                                        //Create the array for all the chars with a size of 5
        Scanner input = new Scanner(System.in);                                                                         //Define the variable input as the Scanner object
        DecimalFormat df = new DecimalFormat("0");                                                               //Create the decimal formatter to handle rounding
        char currentLetterGrade = 0;                                                                                    //Define and initialize currentLetterGrade to 0
	    double averageScore, testScore1, testScore2, testScore3;                                                        //Define all of our doubles

        GRADELETTERS[0] = 'A';                                                                                          //Define the first index of the array to the character 'A'
        GRADELETTERS[1] = 'B';                                                                                          //Define the second index of the array to the character 'B'
        GRADELETTERS[2] = 'C';                                                                                          //Define the third index of the array to the character 'C'
        GRADELETTERS[3] = 'D';                                                                                          //Define the fourth index of the array to the character 'D'
        GRADELETTERS[4] = 'F';                                                                                          //Define the fifth index of the array to the character 'F'

	    // Input
        System.out.print("Please enter your first test score: ");                                                       //Ask for the first grade score
        testScore1 = input.nextDouble();                                                                                //Initializes testScore1 with the user's input as a double
        System.out.print("\nPlease enter your second test score: ");                                                    //Ask for the second grade score
        testScore2 = input.nextDouble();                                                                                //Initializes testScore2 with the user's input as a double
        System.out.print("\nPlease enter your third test score: ");                                                     //Ask for the third grade score
        testScore3 = input.nextDouble();                                                                                //Initializes testScore3 with the user's input as a double

        // Processing
        averageScore = ( testScore1 + testScore2 + testScore3 ) / 3;                                                    //Initialize the averageScore variable and calculate the average as the value

        if (averageScore < 60)                                                                                          //If the scores average is less than 60:
            currentLetterGrade = GRADELETTERS[4];                                                                       //Set currentLetterGrade to F
         else if (averageScore < 70)                                                                                    //If the scores average is less than 70:
            currentLetterGrade = GRADELETTERS[3];                                                                       //Set the currentLetterGrade to D
         else if (averageScore < 80)                                                                                    //If the scores average is less than 80:
            currentLetterGrade = GRADELETTERS[2];                                                                       //Set the current grade to C
         else if (averageScore < 90)                                                                                    //If the scores average is less than 90:
            currentLetterGrade = GRADELETTERS[1];                                                                       //Set the grade to B
         else if (averageScore <= 100)                                                                                  //If the scores average is less than or equal to 100:
            currentLetterGrade = GRADELETTERS[0];                                                                       //Set the grade to A

        // Output
        switch (currentLetterGrade)
        {                                                                                                               //Set the condition to be the currentLetterGrade
            case 'A':                                                                                                   //If the letter grade is an A:
                System.out.printf("\nWonderful! You made an %s%%, which is the letter grade %c!!",                      //String to be printed
                        df.format(averageScore), currentLetterGrade);                                                   //Define and replace %s and %c
                break;                                                                                                  //Exit switch
            case 'B':                                                                                                   //If the letter grade is a a B:
                System.out.printf( "\nNice work! You made an %s%%, which is the letter grade %c!!",                     //String to be printed
                        df.format(averageScore), currentLetterGrade );                                                  //Define and replace %s and %c
                break;                                                                                                  //Exit switch
            case 'C':                                                                                                   //If the letter grade is a C:
                System.out.printf( "\nYou did alright, you made an %s%%, which is the letter grade %c. You should try harder next time!",         //String to be printed
                        df.format(averageScore), currentLetterGrade );                                                  //Define and replace %s and %c
                break;                                                                                                  //Exit switch
            case 'D':                                                                                                   //If the letter grade is a D:
                System.out.printf( "\nWell, at least you didn't fail with your %c. You made an %s%%.",                  //String to be printed
                        currentLetterGrade, df.format(averageScore) );                                                  //Define and replace %c and %s
                break;                                                                                                  //Exit switch
            case 'F':                                                                                                   //If the letter grade is a F
                System.out.printf( "\nYou got a %c, but there's always a next time! You made a %s%%.",                  //String to be printed
                        currentLetterGrade, df.format(averageScore) );                                                  //Define and replace %c and %s
                break;                                                                                                  //Exit switch
            default:                                                                                                    //If there is no match then:
                System.out.printf("\nYou don't have a valid grade letter!");                                            //Print out message
        } //switch (currentLetterGrade)
    } //end main
} //end class
