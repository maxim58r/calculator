package ru.max;

public class ParseInt {
   private final int intVal;
    public ParseInt(String s) throws NumberException {
        intVal = Integer.parseInt(s);
        if (intVal <= 0 || intVal > 10)
            throw new NumberException("Number more than 10 or less than 1");
    }

    public int getIntVal() {
        return intVal;
    }
}
