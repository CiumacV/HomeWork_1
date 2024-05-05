package org.tekwildisplays.operaationsandciclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Egal cu
        boolean isEqual = a == b;
        System.out.println("Diferit de: " + isEqual);

        //Diferit de
        boolean isNotEqual = a != b;
        System.out.println("Diferit de: " + isNotEqual);

        //Mai mare decat
        boolean isGreaterThan = a > b;
        System.out.println("Mai mare decat; " + isGreaterThan);

        //Mai mic decat
        boolean isLessThan = a < b;

        //Mai mare sau egal cu
        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Mai mare sau egal cu; " + isGreaterThanOrEqual);

        //Mai mic saau egal cu
        boolean isLessThanOrEqual = a <= b;
        System.out.println("Mai mic saau egal cu: " + isLessThanOrEqual);
    }
}
