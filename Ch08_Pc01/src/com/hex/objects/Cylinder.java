package com.hex.objects;

public class Cylinder
{
    private double radius;
    private double height;

    public Cylinder()
    {
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cylinder(double r, double h)
    {
        this.radius = r;
        this.height = h;
    }

    public double getHeight()
    {
        return height;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
