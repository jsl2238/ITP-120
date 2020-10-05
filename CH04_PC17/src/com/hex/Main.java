package com.hex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //Housekeeping
        Scanner input = new Scanner(System.in);
        int num, userGuess = 0;
        num = (int) (Math.random() * 100);

        //Input

        //Processing

        while (userGuess != num)
        {
            System.out.printf("\n\nPlease pick a number between 0 - 100: ");
            userGuess = input.nextInt();
            if (userGuess >= 0 && userGuess <= 100)
            {
                if (userGuess < num)
                    System.out.printf("Too low, try again.");
                if (userGuess > num)
                    System.out.printf("Too high, try again.");
                if (userGuess == num)
                    System.out.printf("You win!");
            } else
                {
                    System.out.printf("You entered an invalid number, restart the program and try again!");
                    break;
                }
        }

        //Output


    }
}
