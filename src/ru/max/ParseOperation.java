package ru.max;

public class ParseOperation {
    private final char operator;

    public ParseOperation(String operation) {
        operator = operation.charAt(0);
    }

    public char getOperator() {
        return operator;
    }
}
