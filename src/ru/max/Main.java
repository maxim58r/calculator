package ru.max;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter values: ");
        String inputValues = in.nextLine();

        new ProcessingIncomValues(inputValues);


    }

//    private static void arrCol(String inputValues) {
//        ArrayList<String> arrVal = new ArrayList<>();
//
//        Collections.addAll(arrVal, inputValues.split(" "));
//
//        for (String val : arrVal) {
//            DefiningValue dv = new DefiningValue(val);
//            dv.matcher();
//        }
//    }
}
