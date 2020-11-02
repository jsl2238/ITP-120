package com.hex;

import com.hex.Circle;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("What is your circle's radius? ");
        Circle circle1 = new Circle(input.nextDouble());

        Circle circle2 = new Circle();
        System.out.printf("\nAnother circle with zero radius is being prepared!");

        System.out.printf("\n\nWhat radius would you like for the empty circle? ");
        circle2.setRadius(input.nextDouble());

        System.out.printf("\nYour first circle has a radius of %.1f; an area of %.1f; a diameter of %.1f; and a circumference of %.1f (using 3.14159 for PI).",
                          circle1.getRadius(), circle1.area(), circle1.diameter(), circle1.circumference());
        System.out.printf("\nYour second circle has a radius of %.1f; an area of %.1f; a diameter of %.1f; and a circumference of %.1f (using 3.14159 for PI).",
                          circle2.getRadius(), circle2.area(), circle2.diameter(), circle2.circumference());
    }
}
