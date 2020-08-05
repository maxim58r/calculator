package ru.max;

import java.util.ArrayList;

public class ConverterRomanNumberCalc implements NumberCalc {
    private String romanNum;
    private int arabNum;

    public ConverterRomanNumberCalc(String romanNum){
        this.romanNum = romanNum;
    }

    public ConverterRomanNumberCalc(int arabNum) {
        this.arabNum = arabNum;
    }

    @Override
    public int getNumber() {
        return romanToInt(romanNum);
    }

    public String getRomanNum() {
        return intToRoman(arabNum);
    }

    private String intToRoman(int arabNum) {
        StringBuilder result = new StringBuilder();
        while (arabNum > 0) {
            if ((arabNum / 1000) >= 1) {
                result.append("M");
                arabNum = arabNum - 1000;
            } else if ((arabNum / 500) >= 1) {
                result.append("D");
                arabNum = arabNum - 500;
            } else if ((arabNum / 100) >= 1) {
                result.append("C");
                arabNum = arabNum - 100;
            } else if ((arabNum / 50) >= 1) {
                result.append("L");
                arabNum = arabNum - 50;
            } else if ((arabNum / 10) >= 1) {
                result.append("X");
                arabNum = arabNum - 10;
            } else {
                switch ((arabNum)) {
                    case 9:
                        result.append("IX");
                        arabNum = arabNum - 9;
                        break;
                    case 8:
                        result.append("VIII");
                        arabNum = arabNum - 8;
                        break;
                    case 7:
                        result.append("VII");
                        arabNum = arabNum - 7;
                        break;
                    case 6:
                        result.append("VI");
                        arabNum = arabNum - 6;
                        break;
                    case 5:
                        result.append("V");
                        arabNum = arabNum - 5;
                        break;
                    case 4:
                        result.append("IV");
                        arabNum = arabNum - 4;
                        break;
                    case 3:
                        result.append("III");
                        arabNum = arabNum - 3;
                        break;
                    case 2:
                        result.append("II");
                        arabNum = arabNum - 2;
                        break;
                    case 1:
                        result.append("I");
                        arabNum = arabNum - 1;
                        break;
                }
            }
        }
        return result.toString();
    }

    private int romanToInt(String romanNum) {
        int intValue = 0;
        int last = 0;
        ArrayList<String> romanList = new ArrayList<String>();
        for (int i = 0; i <= 1000; i++) {
            romanList.add(i, "0");
        }
        romanList.set(1, "I");
        romanList.set(10, "X");
        romanList.set(100, "C");
        romanList.set(1000, "M");
        romanList.set(5, "V");
        romanList.set(50, "L");
        romanList.set(500, "D");

        for (int i = romanNum.length(); i > 0; i--) {
            String category = romanNum.substring(i - 1, i);
            int lastValue = romanList.indexOf(category);

            if (lastValue >= last) {
                intValue += lastValue;
            } else {
                intValue -= lastValue;
            }
            last = lastValue;
        }
        return intValue;
    }
}
