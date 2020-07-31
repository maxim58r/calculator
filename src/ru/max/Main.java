package ru.max;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter values: ");
        String inputValues = in.nextLine();

        ArrayList<String> arrVal = new ArrayList<>();

        Collections.addAll(arrVal, inputValues.split(" "));
        ParseVal parseVal = new ParseVal(arrVal);

    }
}
