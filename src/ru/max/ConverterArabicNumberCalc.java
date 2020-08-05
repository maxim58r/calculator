package ru.max;

public class ConverterArabicNumberCalc implements NumberCalc {
    private final int intVal;

    public ConverterArabicNumberCalc(String number){
        this.intVal = Integer.parseInt(number);}

    @Override
    public int getNumber() {
        return intVal;
    }
}

