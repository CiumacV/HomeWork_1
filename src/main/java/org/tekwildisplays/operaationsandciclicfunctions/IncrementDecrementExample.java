package org.tekwildisplays.operaationsandciclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5;

        //Increment
        a++;
        System.out.println("Valoare dupa increment: " + a);

        //Increment pre-fixata
        ++a;
        //a = 7
        int b = ++a;
        // b = 8 ; a = 8;
        int a1 = a;
        int c = a++;
        // c = = ; a = 9;
        System.out.println("Valoare dupa increment pre-fixata; " + a);
        System.out.println("Afiseaza b = " + b + " a1 = " + a1 + " c = " + c + " a2 = " + a);

        //Decrementare
        a--;
        System.out.println("Vaaloarea a dupa decrementare: " + a);


        //Decrementare pre-fixata
        --a;
        System.out.println("Valoarea dupa decrement pre-fixata; " + a);
    }
}
