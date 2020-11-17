package com.hex.objects;

public class Circle
{
    private double radius;                  // field for the radius

    public Circle()
    {
        this.radius = 0.0;                  // radius needs to be defaulted to 0
    } // end Circle()

    public Circle(double rad)
    {
        this.radius = rad;                  // set the radius of the circle when initialized
    } // end Circle(double rad)

    public void setRadius(double rad)
    {
        this.radius = rad;                  // set the radius of the
    }  // end setRadius(double rad)

    public double getRadius()
    {
        return radius;                      // return the radius
    } // end getRadius()
}
