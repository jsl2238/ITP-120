package com.hex;

import com.hex.classes.Area;
import com.hex.objects.Circle;
import com.hex.objects.Cylinder;
import com.hex.objects.Rectangle;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);                      // grab the scanner

        Circle circ = new Circle();                                 // create a circle object
        Rectangle rect = new Rectangle();                           // create a rectangle object
        Cylinder cylc = new Cylinder();                             // create a cylinder object

        System.out.printf("\nCircle creation stared; Please enter the radius of your circle: ");                // Ask for circle's radius
        circ.setRadius(scan.nextDouble());              // set radius of circle object
        System.out.printf("\nRectangle creation started; Please enter the width: ");                            // Ask for rectangle's width
        rect.setWidth(scan.nextDouble());               // set width of rectangle
        System.out.printf("Please enter the height: ");                  // Ask for height of Rectangle
        rect.setHeight(scan.nextDouble());              // set height of rectangle
        System.out.printf("\nCylinder creation started: Please enter the height: ");                            // Ask for cylinder's height
        cylc.setHeight(scan.nextDouble());              // set height of the cylinder
        System.out.printf("Please enter the radius: ");                  // Ask for the radius of the cylinder
        cylc.setRadius(scan.nextDouble());              // set the radius of the cylinder

        System.out.printf("\n-----------------------------------------");
        System.out.printf("\nThe circle's radius: %.3f", circ.getRadius());                             // output circle's radius
        System.out.printf("\nThe circle's area: %.2f", Area.area(circ));                                // output circle's area
        System.out.printf("\n\nThe rectangle's width: %.3f", rect.getWidth());                          // output the rectangle's width
        System.out.printf("\nThe rectangle's height: %.3f", rect.getHeight());                          // output the rectangle's height
        System.out.printf("\nThe rectangle's area: %.2f", Area.area(rect));                             // output the rectangle's area
        System.out.printf("\n\nThe cylinder's radius: %.3f", cylc.getRadius());                         // output the cylinder's radius
        System.out.printf("\nThe cylinder's height: %.3f", cylc.getHeight());                           // output the cylinder's height
        System.out.printf("\nThe cylinder's area (Actually volume): %.2f", Area.area(cylc));            // output the area of the cylinder
    } // end main(String[] args)
}
