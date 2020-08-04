package ru.max;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberException {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter values: ");
        String inputValues = in.nextLine();

        ProcessingIncomingValues piv = new ProcessingIncomingValues(inputValues);
        ArrayList<String> arrVal = piv.getArrVal();
        DecomposeArrayValues decomposeArrayValues = new DecomposeArrayValues(arrVal);
        String num1 = decomposeArrayValues.getNumber1();
        String num2 = decomposeArrayValues.getNumber2();
        String operator = decomposeArrayValues.getOperator();

        DeterminingTheTypeOfNumber dvn1 = new DeterminingTheTypeOfNumber(num1);
        DeterminingTheTypeOfNumber dvn2 = new DeterminingTheTypeOfNumber(num2);
        DefiningValueOperator dvo = new DefiningValueOperator(operator);

        System.out.println(new Calculating(dvn1.matcher(),dvn2.matcher(),dvo.matcher()).calculation());

    }
}
