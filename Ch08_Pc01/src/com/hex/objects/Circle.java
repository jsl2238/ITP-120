package com.hex.objects;

public class Circle
{
    private double radius;

    public Circle()
    {
        this.radius = 0.0;
    }

    public Circle(double rad)
    {
        this.radius = rad;
    }

    public void setRadius(double rad)
    {
        this.radius = rad;
    }

    public double getRadius()
    {
        return radius;
    }
}
