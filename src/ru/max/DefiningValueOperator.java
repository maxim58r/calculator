package ru.max;

import java.util.regex.Pattern;

public class DefiningValueOperator {
    private final String value;

    public DefiningValueOperator(String value) {
        this.value = value;
    }

    public char matcher() {
        char operator = 0;
        boolean foundOperations = Pattern.matches("[-+/*]", value);

        if (foundOperations) {
            operator = new ParseOperation(value).getOperator();
        }
        return operator;
    }
}
