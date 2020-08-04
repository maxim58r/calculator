package ru.max;

import java.util.ArrayList;

/**
 * @author Serov Maxim
 */
public class DecomposeArrayValues {
    private final ArrayList<String> arrVal;

    public DecomposeArrayValues(ArrayList<String> arrVal) {
        this.arrVal = arrVal;
        try {
            if (arrVal.size() < 3)
                throw new NumberException("Not enough operators to calculate");
        } catch (NumberException e) {
            e.printStackTrace();
        }
    }

    public String getNumber1() {
        return arrVal.get(0);
    }

    public String getNumber2() {
        return arrVal.get(2);
    }

    public String getOperator() {
        return arrVal.get(1);
    }
}
