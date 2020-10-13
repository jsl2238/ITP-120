package com.hex;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Housekeeping
        Scanner input = new Scanner(System.in);                                           //Define input
        final String PICKNUM, WINMSG, TOOLOWMSG, TOOHIGHMSG, INVALIDMSG;                  //Define all strings to be used
        int randomNum, userGuess = -1;                                                    //Define all integers to use

        randomNum = (int) (Math.random() * 101);                                          //Randomly generating a number
        PICKNUM = "\n\nPlease pick a number between 0 - 100: ";                           //Ask user to pick a number
        WINMSG = "\n\nYou win!";                                                          //Define the message for if user wins
        TOOLOWMSG = "Too low, try again.";                                                //Define the message for if user's guess was too low
        TOOHIGHMSG = "Too high, try again.";                                              //Define the message for if the user's guess was too high
        INVALIDMSG = "Invalid number, try again!";                                        //Define the message for if the user's input is in valid

        while (userGuess != randomNum)                                                    //Start of while loop (As long as the user's guess does not equal the number
        {
            System.out.printf(PICKNUM);                                                   //Ask the user to pick a number
            userGuess = input.nextInt();                                                  //Get the user's input
            if (userGuess >= 0 && userGuess <= 100)                                       //Test if user's guess is greater than or equal to 0 and that the user guess is less than or equal to 100
            {
                if (userGuess < randomNum)                                                //Test if the user guess is less than the number
                    System.out.printf(TOOLOWMSG);                                         //If it is, then print out the tooLowMsg
                if (userGuess > randomNum)                                                //Test if the user guess is higher than the number
                    System.out.printf(TOOHIGHMSG);                                        //If it is, then print out the tooHighMsg
                if (userGuess == randomNum)                                               //Test if the user guess the answer right
                    System.out.printf(WINMSG);                                            //If it is, print out winMsg
            } else                                                                        //If the user guess doesn't follow the previous criteria
            {
                System.out.printf(INVALIDMSG);                                            //Print out that the user has an invalid guess
            } //if (userGuess >= 0 && userGuess <= 100) and else
        } //while (userGuess != randomNum)
    } //main()
} //Class Ch04_Pc17_Lester()

