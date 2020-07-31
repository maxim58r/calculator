package ru.max;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefiningValue {
    private String value;

    public DefiningValue(String value) {
        this.value = value;
    }


    Pattern patternOperations = Pattern.compile("[-+/*]");
    Pattern patternNumbers = Pattern.compile("[0-9]");
    Pattern patternRomanNumerals = Pattern.compile("[IXV]"); // [IXV] roman numerals


    private void matcher(Pattern pattern) {
        Matcher matcher = pattern.matcher(value);

            value.substring(matcher.start(), matcher.end());
        

        if(patternOperations.matcher(value))
    }
}
