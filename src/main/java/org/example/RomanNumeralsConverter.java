package org.example;

public class RomanNumeralsConverter {

    public String convert(int number) {
        String onesPlaceStr="";
        String tensPlaceStr="";
        //if number is 1 return "I"
        // code removed if ( number == 1) { return "I"; }
        // create ONES place string arrary to return 1 to 9 and zero is empty string®
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        // use number % 10 modulus to return the ones place digit (division reminder)
        int onesPlace = number % 10;
        // if zero, empty string is assigned, otherwise roman numeral is assigned
        onesPlaceStr = ones[onesPlace];
        // create TENS string array for tens place values

        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        // use number % 100 /10 modulus to return the tens place digit
        // create HUNDREDS string array for hundreds place values

        return onesPlaceStr;
    }

}
