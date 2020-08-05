package ru.max;

public class Calculating {
    NumberCalc number1;
    NumberCalc number2;
    private final int numberOne;
    private final int numberTwo;
    private final char operation;

    public Calculating(NumberCalc number1, NumberCalc number2, char operation) throws NumberException {
        this.number1 = number1;
        this.number2 = number2;
        if (number1.getClass().equals(number2.getClass())) {
            this.numberOne = number1.getNumber();
            this.numberTwo = number2.getNumber();
            this.operation = operation;
        } else
            throw new NumberException("Different types of numbers");
    }

    public String calculationNum() {
        String i = null;
        if (number1.getClass().toString().equals("class ru.max.ConverterRomanNumberCalc")) {
            int j = calculation(numberOne, numberTwo, operation);
            i = new ConverterRomanNumberCalc(j).getRomanNum();

        } else if (number1.getClass().toString().equals("class ru.max.ConverterArabicNumberCalc")) {
            i = Integer.toString(calculation(numberOne, numberTwo, operation));
        }
        return i;
    }

    public int calculation(int numberOne, int numberTwo, char operation) {
        int result = 0;
        if (operation == ('*')) {
            result = numberOne * numberTwo;
        } else if (operation == ('-')) {
            result = numberOne - numberTwo;
        } else if (operation == ('+')) {
            result = numberOne + numberTwo;
        } else if (operation == ('/')) {
            result = numberOne / numberTwo;
        }
        return result;
    }
}
