package ru.max;

public class ParseArabicNumberCalc implements NumberCalc {
    private final int intVal;

    public ParseArabicNumberCalc(String number) throws NumberException {
        intVal = Integer.parseInt(number);
        if (intVal <= 0 || intVal > 10)
            throw new NumberException("Number more than 10 or less than 1");
    }

    @Override
    public int getNumber() {
        return intVal;
    }
}

