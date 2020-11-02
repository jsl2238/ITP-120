package com.hex;

public class Circle
{
    private final double PI = 3.14159;
    private double radius;

    public Circle ()
    {
        this.radius = 0.0;
    }

    public Circle (double radius)
    {
        this.radius = radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double area()
    {
        return PI * (radius * radius);
    }

    public double diameter()
    {
        return radius * 2;
    }

    public double circumference()
    {
        return 2 * PI * radius;
    }

}
