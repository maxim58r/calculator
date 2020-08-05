package ru.max;

import java.util.ArrayList;
import java.util.Collections;

public class ProcessingIncomingValues {
   private final ArrayList<String> arrVal = new ArrayList<>();

    public ProcessingIncomingValues(String inputValues) {
        Collections.addAll(arrVal, inputValues.toUpperCase().split(" "));
    }

    public ArrayList<String> getArrVal() {
        return arrVal;
    }
}
