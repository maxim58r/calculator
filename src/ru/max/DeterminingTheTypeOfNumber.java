package ru.max;

import java.util.regex.Pattern;

public class DeterminingTheTypeOfNumber {
    private final String value;

    public DeterminingTheTypeOfNumber(String value) {
        this.value = value;
    }

    private void probablyNumber(int intVal) {
        try {
            if (intVal <= 0 || intVal > 10)
                throw new NumberException("Number more than 10 or less than 1");
        } catch (NumberException e) {
            e.printStackTrace();
        }
    }

    public NumberCalc matcher() {
        NumberCalc matcherNum = null;
        boolean foundNumbers = Pattern.matches("[\\d]+", value);
        boolean foundRomanNumerals = Pattern.matches("[MDCLXVI]+", value);

        if (foundNumbers) {
            int intVal = Integer.parseInt(value);
            probablyNumber(intVal);
            matcherNum = new ConverterArabicNumberCalc(value);
        }

        if (foundRomanNumerals) {
                int i = new ConverterRomanNumberCalc(value).getNumber();
               probablyNumber(i);
                matcherNum = new ConverterRomanNumberCalc(value);
        }
        return matcherNum;
    }
}
