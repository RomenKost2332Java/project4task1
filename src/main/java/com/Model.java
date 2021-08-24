package com;

/**
 * @author Roman Kostenko
 */
public class Model {
    private String value;

    private static final String DELIMITER = " ";

    /**
     * in this method add value and DELIMITER with this.value
     * @param value - String to adding to this.value with delimiter.
     */
    public void addStringOurValue(String value){
        this.value += DELIMITER + value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
