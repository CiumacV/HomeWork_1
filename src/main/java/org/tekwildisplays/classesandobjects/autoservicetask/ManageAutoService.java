package org.tekwildisplays.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage masterLuxObject = new Garage("Str. Calea Orheiului 147", 3, 10.2);
        System.out.println(masterLuxObject.address);

        Garage autoLux = new Garage();
        System.out.println(autoLux.numberOfBoxeses);
        System.out.println(autoLux.address);
        System.out.println(autoLux.dimensionSqFt);

        autoLux.address = "Str. Stefan cel mic";
        autoLux.dimensionSqFt = 251.9;
        autoLux.numberOfBoxeses = 5;

        System.out.println("Informatii despre obiectul autolux de pe adresa" + autoLux.address + " cu num de boxe : " +
                autoLux.numberOfBoxeses + "cu dimensiunea de : " + autoLux.dimensionSqFt);

        Tool hammer011 = new Tool("Hummer");
        System.out.println(hammer011.material);
        System.out.println(hammer011.nameOfTool);


        Tool key = new Tool("Lucky Key");
        System.out.println(key.nameOfTool);

        Worker ionelCelHarnic = new Worker("Ion");

        System.out.println(ionelCelHarnic.pricePerHour);
        ionelCelHarnic.yearsOfExperience = 5;
        System.out.println(ionelCelHarnic.yearsOfExperience);

        Worker marcelCelPuternic = new Worker();

        Car masinaLuiNicoleta = new Car("Masserati", "Blue", 3, 4.4);
        System.out.println(masinaLuiNicoleta.make);

        Car masinaLuiAdrian = new Car("Mercedes", "Black", 3, 6);

        System.out.println(masinaLuiAdrian.colorOfTheCar);

    }
}
