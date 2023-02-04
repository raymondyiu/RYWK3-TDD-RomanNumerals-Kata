package org.example;

public class RomanNumeralsConverter {

    public String convert(int number) {
        //if 1 return "I"
        if (number == 1) {
            return "I";
        }
        //if 5 return "V"
        //if 10 return "X"
        return "out of range";
    }

}
