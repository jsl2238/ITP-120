package com.hex.objects;

public class Rectangle
{
    private double width;
    private double height;

    public Rectangle()
    {
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(double w, double h)
    {
        this.width = w;
        this.height = h;
    }

    public void setHeight(double h)
    {
        this.height = h;
    }

    public void setWidth(double w)
    {
        this.width = w;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }
}