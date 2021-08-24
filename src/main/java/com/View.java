package com;

/**
 * @author Roman Kostenko
 */
public class View {
    public static final String INPUT_DATA = "Input value = ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_DATA = "Value = ";

    public void printMessage(String message){
        System.out.print(message);
    }

    public void printMessageAndValue(String message, String string){
        System.out.print(message + string);
    }

}
