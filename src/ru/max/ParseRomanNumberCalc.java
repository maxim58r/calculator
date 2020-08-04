package ru.max;

public class ParseRomanNumberCalc implements NumberCalc {
    private final String romanNumber;
    private int number;

    public ParseRomanNumberCalc(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    public void romanToArabic() throws NumberException {

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

    @Override
    public int getNumber() {
        System.out.println(number);
        return number;
    }
}
