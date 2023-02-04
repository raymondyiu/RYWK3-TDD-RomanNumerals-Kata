package org.example;

public class RomanNumeralsConverter {

    public String convert(int number) {
        //if number is 1 return "I"
        // code removed if ( number == 1) { return "I"; }
        // create a string arrary to return 1 to 9 and zero is empty string®
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        //
        return units[number];
    }

}
