package com;

import java.util.Scanner;

/**
 * @author Roman Kostenko
 */
public class Controller {
    private static final String HELLO = "Hello";
    private static final String WORLD = "world!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    /**
     * main method, that carries out app.
     */
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setValue(inputStringValueWithScanner(sc, HELLO));
        model.addStringOurValue(inputStringValueWithScanner(sc, WORLD));

        view.printMessageAndValue(View.OUR_DATA, model.getValue());
    }

    /**
     * Method that validates user data by pattern.
     * @return correct user data
     */
    public String inputStringValueWithScanner(Scanner sc, String pattern) {
        view.printMessage(View.INPUT_DATA);
        while( ! sc.hasNext(pattern)) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_DATA);
            sc.next();
        }
        return sc.next();
    }
}
