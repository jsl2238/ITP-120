package com.hex.objects;

public class Rectangle
{
    private double width;                   // field for width
    private double height;                  // field for height

    public Rectangle()
    {
        this.width = 0.0;                   // set default width
        this.height = 0.0;                  // set default height
    }   // end Rectangle()

    public Rectangle(double w, double h)
    {
        this.width = w;                     // set width
        this.height = h;                    // set height
    } // end Rectangle(double w, double h)

    public void setHeight(double h)
    {
        this.height = h;
    }                 // set the height of the rectangle

    public void setWidth(double w)
    {
        this.width = w;
    }                   // set the width of the rectangle

    public double getHeight()
    {
        return height;
    }               // get the rectangle's height

    public double getWidth()
    {
        return width;
    }                 // get the rectangle's width
}