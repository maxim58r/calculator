package ru.max;

import java.util.regex.Pattern;

public class DefiningValue {
    private final String value;

    public DefiningValue(String value) {
        this.value = value;
    }

    public void matcher() {

        boolean foundOperations = Pattern.matches("[-+/*]", value);
        boolean foundNumbers = Pattern.matches("[\\d]+", value);
        boolean foundRomanNumerals = Pattern.matches("[IXV]+", value);

        if (foundOperations) {
            new ParseOperation(value);
            System.out.println("Operation " + value);
        }

        if (foundNumbers) {
            try {
//                new ParseInt(value);
                ParseInt parseInt = new ParseInt(value);
                int i = parseInt.getIntVal();
                System.out.println("Arabic numerals " + i);
            } catch (NumberException e) {
                e.printStackTrace();
            }

        }

        if (foundRomanNumerals) {
           ParseRomanNumber parseRomanNumber = new ParseRomanNumber(value);
            int i = parseRomanNumber.getNumber();
            System.out.println("Roman numerals " + value);

        }
    }
}
