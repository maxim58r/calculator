package ru.max;

public class Calculating {
    private final int number1;
    private final int number2;
    private final ParseOperation operation;

    public Calculating(int number1, int number2, ParseOperation operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public void calculation() {
        int result;
        if (operation.equals('*')) {
            result = number1 * number2;
        } else if (operation.equals('-')) {
            result = number1 - number2;
        } else if (operation.equals('+')) {
            result = number1 + number2;
        } else if (operation.equals('/')) {
            result = number1 / number2;
        }
    }
}
