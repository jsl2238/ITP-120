package com.hex.classes;

import com.hex.objects.Circle;
import com.hex.objects.Cylinder;
import com.hex.objects.Rectangle;

public class Area
{
    public static double area (Circle circ)
    {
        return Math.PI * (Math.pow(circ.getRadius(), 2));

    }
    public static double area (Rectangle rect)
    {
        return rect.getWidth() * rect.getHeight();
    }

    public static double area (Cylinder cyl)
    {
        return Math.PI * Math.pow(cyl.getRadius(), 2) * cyl.getHeight();
    }
}
