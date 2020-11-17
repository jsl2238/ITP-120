package com.hex.objects;

public class Cylinder
{
    private double radius;          // field for radius
    private double height;          // field for height

    public Cylinder()
    {
        this.radius = 0.0;           // set cylinder's default radius
        this.height = 0.0;           // set cylinder's default height
    }   // end Cylinder()

    public Cylinder(double r, double h)
    {
        this.radius = r;             // set cylinder's radius
        this.height = h;             // set cylinder's height
    }   //end cylinder (double r, double h)

    public double getHeight() { return height; }                        // return cylinder height

    public double getRadius() { return radius; }                        // return cylinder radius

    public void setHeight(double height) { this.height = height; }      // set the cylinder height

    public void setRadius(double radius) { this.radius = radius; }      // set the cylinder radius
}
