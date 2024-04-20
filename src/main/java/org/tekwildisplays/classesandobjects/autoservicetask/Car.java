package org.tekwildisplays.classesandobjects.autoservicetask;

public class Car {
    String make;

    String colorOfTheCar;

    int numberOfDoors;

    double motorCapacity;

    public Car(String make, String colorOfTheCar, int numberOfDoors, double motorCapacity) {
        System.out.println("This is full constructor with all the param included");
        this.make = make;
        this.colorOfTheCar = colorOfTheCar;
        this.numberOfDoors = numberOfDoors;
        this.motorCapacity = motorCapacity;
        System.out.println("The object is created, bingo! ");
    }
}
