package ru.max;

public class ParseOperation {
    String operation;
    char operator;
    public ParseOperation(String operation) {
        this.operation = operation;
    }

    public char operator() {
        operator = operation.charAt(0);
        return operator;
    }

}
