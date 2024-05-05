package org.tekwildisplays.operaationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 58;
        if(testResult >= 90){
            System.out.println("Calificatul A");
        }else if (testResult >= 80){
            System.out.println("Calificatul B");
        } else if (testResult >= 70) {
            System.out.println("Calificatul C");
        } else if (testResult >= 60) {
            System.out.println("Calificatul D");
        }else {
            System.out.println("Un astefel de calificativ nu este definit");
        }

        System.out.println("Programul sa terminat");
    }
}
