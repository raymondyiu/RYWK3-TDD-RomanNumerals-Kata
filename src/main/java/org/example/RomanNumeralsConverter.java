package org.example;

public class RomanNumeralsConverter {

    public String convert(int number) {
        String onesPlaceStr="";
        String tensPlaceStr="";
        String hundredsPlaceStr="";
        //if number is 1 return "I"
        // code removed if ( number == 1) { return "I"; }
        // create ONES place string arrary to return 1 to 9 and zero is empty string®
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        // use number % 10 modulus to return the ones place digit (division reminder)
        //int onesPlace = number % 10; remove for simpler code
        // if zero, empty string is assigned, otherwise roman numeral is assigned
        onesPlaceStr = ones[number % 10];

        // create TENS string array for tens place values
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        // use number % 100 /10 modulus to return the tens place digit
        tensPlaceStr = tens[number %100 / 10];

        // create HUNDREDS string array for hundreds place values
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCC", "CM" };
        // use number % 1000 / 100 modulus to retunr the hundreds place digit
        hundredsPlaceStr = hundreds[number % 1000 / 100];

        return hundredsPlaceStr + tensPlaceStr + onesPlaceStr;
    }

}
