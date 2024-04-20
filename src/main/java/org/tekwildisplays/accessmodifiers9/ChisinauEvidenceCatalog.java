package org.tekwildisplays.accessmodifiers9;

import org.tekwildisplays.accessmodifiers9.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person vaniusaPerson = new Person("Ion", "Burlacu", 1);

        vaniusaPerson.isRetired = true;

        if (vaniusaPerson.isRetired) {
            System.out.println("Vaniusa este la pensie( adica bonus la salariu)");
        } else {
            System.out.println("Ion nu este la pensie");
        }

        Person arturTractoristu = new Person("Artur", "Tractoristul", 2, "Chisinau", false);

        if (arturTractoristu.isRetired) {
            System.out.println("Artur este la pensie( adica bonus la salariu)");
        } else {
            System.out.println("Artur nu are bonus de batranete");
        }

        Person alexeiPopovici = new Person("Alexei", "Popovici", 3);

        alexeiPopovici.isRetired = false;

        if (alexeiPopovici.isRetired) {
            System.out.println("Alexei are bonus la salariu");
        } else {
            System.out.println("Alexei nu are bonus la salariu in forma de pensie");
        }

        Person anatoliiMangal = new Person("Anatolii", "Mangal",4,"Valea mortilor",true);

        if (anatoliiMangal.isRetired){
            System.out.println("E in viata si va primi urmatoarea pensie");
        }else {
            System.out.println("Turnati jin si da-ti galuste");
        }

        Person alinaMarari = new Person("Alina","Marari", 5, "Piata centrala",false);

        if (alinaMarari.isRetired){
            System.out.println("Alina e pensionata");
        }else {
            System.out.println("Alina nu este pensionata fiindca nu a declarat veniturile de pe marari");
        }
    }
}
