package ru.max;

import java.util.ArrayList;
import java.util.Collections;

public class ProcessingIncomValues {
    public ProcessingIncomValues(String inputValues) {
        ArrayList<String> arrVal = new ArrayList<>();

        Collections.addAll(arrVal, inputValues.split(" "));

        for (String val : arrVal) {
            DefiningValue dv = new DefiningValue(val);
            dv.matcher();
        }
    }
}
