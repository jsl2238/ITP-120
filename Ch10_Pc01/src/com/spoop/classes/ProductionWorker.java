package com.spoop.classes;

public class ProductionWorker extends Employee
{
    private int shift;
    private double hourlyPay;

    // Default Constructor
    public ProductionWorker()
    {
        super();
        this.shift = 0;
        this.hourlyPay = 0.0;
    }

    // Employee Constructor
    public ProductionWorker(String name, String empNum, String hireDate)
    {
        super(name, empNum, hireDate);
    }

    // Constructor
    public ProductionWorker(String name, String empNum, String hireDate, int shift, double hourly)
    {
        super(name, empNum, hireDate);
        this.shift = shift;
        this.hourlyPay = hourly;
    }

    // Copy Constructor
    public ProductionWorker(ProductionWorker worker)
    {
        super(worker.getEmployeeName(), worker.getEmpNum(), worker.getHireDate());
        this.shift = worker.shift;
        this.hourlyPay = worker.getHourlyPay();
    }

    public int getShift()
    {
        return shift;
    }

    public void setShift(int shift)
    {
        if (shift < 1 || shift > 2)
        {
            System.out.printf("\nDay shift should be initialize as 1, night shift should be initialize as 2!");
        } else {
            this.shift = shift;
        }
    }

    public double getHourlyPay()
    {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay)
    {
        this.hourlyPay = hourlyPay;
    }
}
