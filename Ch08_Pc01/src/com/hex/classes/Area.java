package com.hex.classes;

import com.hex.objects.Circle;
import com.hex.objects.Cylinder;
import com.hex.objects.Rectangle;

public class Area
{
    public static double area (Circle circ)
    {
        return Math.PI * (Math.pow(circ.getRadius(), 2));                        // Return the area of the circle

    } // end area (Circle circ)
    public static double area (Rectangle rect)
    {
        return rect.getWidth() * rect.getHeight();                               // return the area of the Rectangle
    } // end area (Rectangle rect)

    public static double area (Cylinder cyl)
    {
        return Math.PI * Math.pow(cyl.getRadius(), 2) * cyl.getHeight();         // return the area of a cylinder
    } // end area (Cylinder cyl)
}
