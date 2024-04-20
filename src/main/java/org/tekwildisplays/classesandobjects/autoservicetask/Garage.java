package org.tekwildisplays.classesandobjects.autoservicetask;

public class Garage {

    String address;

    int numberOfBoxeses;

    double dimensionSqFt;

    public Garage(String addressUsedForInitialization, int numberOfBoxeses, double dimensionSqFt){
        address = addressUsedForInitialization;
        this.numberOfBoxeses = numberOfBoxeses;
        this.dimensionSqFt = dimensionSqFt;
    }
    public Garage() {
        System.out.println("A fost creat un obiect care insa nu are nici un parametru populat cu date " +
                "concrete acesta e constructor definit fara parametri");
    }
}


