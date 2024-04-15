package org.tekwildisplays.variablesandcomments;

public class LaptopSpecifications {
    public static void main(String[] args) {
        boolean laptopForGaming;
        boolean hdr;
        char justLatter;
        char productDataSheet;
        byte firstNumbers;
        byte secondNumbers;
        short myBudget;
        int price;
        int serialNumber;
        long thirdNumbers;
        float commission;
        double companyCommission;

        String currency;
        String name;

        Object exmpluDeObiect;

        laptopForGaming = true;
        hdr = false;
        justLatter = 'X';
        productDataSheet = 'G';
        firstNumbers = 127;
        secondNumbers = 55;
        myBudget = -32000;
        price = 32000;
        thirdNumbers = 43636345;
        commission = 35.345654F;
        companyCommission = 3400.465473;
        serialNumber = 506937845;
        currency = "DKK";
        name = "Asus Zephyrus";

        exmpluDeObiect = new Object();



        System.out.println("Gaming laptop: "+ laptopForGaming);
        System.out.println("Laptop name: " + name);
        System.out.println("Price: " + price + " " + currency);
        System.out.println("Commission: " + commission + "DKK");
        System.out.println("Company commission: " + companyCommission + "DKK");
        System.out.println("My budget: " + myBudget + "😊");
        System.out.println("HDR: " + hdr);
        System.out.println("Product data sheet from(A->G): " + productDataSheet);
        System.out.println("Serial number: " + serialNumber);
        System.out.println("Model num.: " + justLatter + firstNumbers + secondNumbers + thirdNumbers);
    }
}
