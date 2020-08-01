package ru.max;

public class ParseRomanNumber implements Number {
    private final String romanNumber;

    public int getNumber() {
        return number;
    }

    private int number;

    public ParseRomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    public void parseToArabic() throws NumberException {

        switch (romanNumber) {
            case "I":
                number = 1;
                break;
            case "II":
                number = 2;
                break;
            case "III":
                number = 3;
                break;
            case "IV":
                number = 4;
                break;
            case "V":
                number = 5;
                break;
            case "VI":
                number = 6;
                break;
            case "VII":
                number = 7;
                break;
            case "VIII":
                number = 8;
                break;
            case "IX":
                number = 9;
                break;
            case "X":
                number = 10;
                break;
            default:
                throw new NumberException("The entered number is not Roman");
        }
    }
}
