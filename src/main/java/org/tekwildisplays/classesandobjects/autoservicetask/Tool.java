package org.tekwildisplays.classesandobjects.autoservicetask;

public class Tool {

    String nameOfTool;

    String material;

    public Tool(String enteredNameOfTheTool){
        nameOfTool = enteredNameOfTheTool;
        System.out.println("The constructor with param was used and the material is still null");
    }
}
