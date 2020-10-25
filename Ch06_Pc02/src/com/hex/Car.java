package com.hex;

public class Car
{
    private String carMake;
    private int yearModel;
    private int speed;

    public Car (int modelYear, String makeOfCar)
    {
        yearModel = modelYear;
        carMake = makeOfCar;
        speed = 0;
    }

    public String getCarMake()
    {
        return carMake;
    }

    public int getYearModel()
    {
        return yearModel;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void accelerate()
    {
        speed += 5;
    }

    public void brake()
    {
        speed -= 5;
    }
}
