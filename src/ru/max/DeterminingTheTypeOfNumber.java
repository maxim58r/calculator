package ru.max;

import java.util.regex.Pattern;

public class DeterminingTheTypeOfNumber {
    private final String value;

    public DeterminingTheTypeOfNumber(String value) {
        this.value = value;
    }

    public NumberCalc matcher() {
        NumberCalc dvn = null;
        boolean foundNumbers = Pattern.matches("[\\d]+", value);
        boolean foundRomanNumerals = Pattern.matches("[IXV]+", value);

        if (foundNumbers) {
            try {
                dvn = new ParseArabicNumberCalc(value);
            } catch (NumberException e) {
                e.printStackTrace();
            }
        }

        if (foundRomanNumerals) {
            dvn = new ParseRomanNumberCalc(value);
        }
        return dvn;
    }
}
