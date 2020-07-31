package ru.max;

import java.util.ArrayList;

public class ParseVal {
    private int firstVal;
    private String secondVal;
    private int thirdVal;

    public ParseVal(ArrayList<String> list) {
        this.firstVal = Integer.parseInt(list.get(0));
        this.secondVal = list.get(1);
        this.thirdVal = Integer.parseInt(list.get(2));
    }

    private void firstParse() {

    }
}
