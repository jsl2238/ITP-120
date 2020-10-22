package com.hex;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final String Q_HOW_MANY_ROOMS = "How many rooms do you have? ",
                     Q_PRICE_PER_GALLON = "\nHow much does the paint cost per gallon? ",
                     NUMBER_OF_GALLONS_REQUIRED_OUT = "\nIt will take %.1f gallons of paint to paint the room.",
                     HOW_MANY_HOURS_OUT = "\nThe job will take %.1f hours to complete.",
                     COST_OF_PAINT_OUT = "\nThe cost of the paint will be $%.2f.",
                     COST_OF_LABOR_OUT = "\nThe cost for labor is $%.2f.",
                     TOTAL_COST_OUT = "\nThe total cost of the entire job is $%.2f.";           // Define all String Literals

        final double WAGE = 18;   // Define how much wage is

        Scanner scan = new Scanner(System.in);   // Define the Scanner

        int numOfRooms = -1;   // Initialize the number of rooms
        double gasPerGallon = -1, roomAmount;   // Initialize gasPerGallon, define roomAmount;

        while (numOfRooms <= 0)
        {
            System.out.printf(Q_HOW_MANY_ROOMS);   //  Ask the user how many rooms
            numOfRooms = scan.nextInt();   // store how many rooms
            if (numOfRooms <= 0)
            {
                System.out.println("Please enter a number greater than 0\n");   // warning message
            }   // end if (numOfRooms <= 0)
        }   // end of while (numOfRooms <= 0)

        while (gasPerGallon <= 0)
        {
            System.out.printf(Q_PRICE_PER_GALLON);   // ask how much paint is
            gasPerGallon = scan.nextDouble();   // save how much paint is
            if (gasPerGallon <= 0.0)
            {
                System.out.println("Please enter a number greater than 0\n");   // warning message
            }   // end of (gasPerGallon <= 0.0)
        }   // end of while (gasPerGallon <= 0)

        roomAmount = roomSizes(scan, numOfRooms);   // define the roomAmount

        System.out.printf(NUMBER_OF_GALLONS_REQUIRED_OUT, roomAmount);    // print out the number of gallons required
        System.out.printf(HOW_MANY_HOURS_OUT, roomAmount * 8);   // print out how many hours it will take
        System.out.printf(COST_OF_PAINT_OUT, calcPaintCost(gasPerGallon,roomAmount));    // print out the cost of the paint
        System.out.printf(COST_OF_LABOR_OUT, calcLaborCost(WAGE, roomAmount));    // print out the cost of labor
        System.out.printf(TOTAL_COST_OUT, totalCost(gasPerGallon, WAGE,roomAmount));   // print out hte total cost
    }

    public static double totalCost(double pricePerGallon, double wage, double roomAmount)
    {
        double total = calcPaintCost(pricePerGallon, roomAmount) + calcLaborCost(wage, roomAmount);   // define the total to be returned
        return total;   // return the total
    }   // define totalCost with the parameters of pricePerGallon, wage, roomAmount

    public static double calcPaintCost (double pricePerGallon, double roomAmount)
    {
        double gasPrice = roomAmount * pricePerGallon;   // define the gasPrice calculation
        return gasPrice;   // return the gasPrice
    }   // define calcPaintCost with the parameters of pricePerGallon, roomAmount

    public static double calcLaborCost (double wage, double roomAmount)
    {
        double laborPrice = (roomAmount * 8) * wage;   // define the laborPrice calculation
        return laborPrice;   // return the laborPrice
    }   // define calcLaborCost with parameters of wage, roomAmount

    public static double roomSizes(Scanner scan, int numOfRooms) {
        double totalRoomSizes = 0;   // define totalRoomSizes

        for (int i = 0; i < numOfRooms; i++) {
            int roomSize;   // define roomSize
            System.out.printf("\nEnter the size of room %d: ", i + 1);   // ask for the room size
            totalRoomSizes += (double) scan.nextInt() / 115;   // add totalRoomSizes to scan.nextInt() / 115;
        }   // end for (i=0; i< numOfRooms; i++)

        return totalRoomSizes;   // return the totalRoomSizes
    }   // define roomSizes with the parameters of scan and numOfRooms
}