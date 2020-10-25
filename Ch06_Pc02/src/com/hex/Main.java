package com.hex;

import com.hex.Car;

public class Main
{
    public static void main(String[] args)
    {
        Car newStudebaker = new Car(1940, "Studebaker");
        Car newAlfaRomeo = new Car(2015, "Alfa Romeo");
        Car newFordFlex = new Car(2013, "Ford Flex");

        for (int i=0; i<=4; i++)
        {
            newAlfaRomeo.accelerate();
            System.out.printf("\nCurrent speed of the %d %s is %d", newAlfaRomeo.getYearModel(), newAlfaRomeo.getCarMake(), newAlfaRomeo.getSpeed());
        }

        for (int i=0; i<=4; i++)
        {
            newAlfaRomeo.brake();
            System.out.printf("\nCurrent speed of the %d %s is %d", newAlfaRomeo.getYearModel(), newAlfaRomeo.getCarMake(), newAlfaRomeo.getSpeed());
        }

    }
}
