package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {

    @Test
    public void convertOnetoNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("I", romanNumeralsConverter.convert(1));
    }

    @Test
    public void convert2to9toRomanNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("II", romanNumeralsConverter.convert(2));
        assertEquals("III", romanNumeralsConverter.convert(3));
        assertEquals("IV", romanNumeralsConverter.convert(4));
        assertEquals("V", romanNumeralsConverter.convert(5));
        assertEquals("VI", romanNumeralsConverter.convert(6));
        assertEquals("VII", romanNumeralsConverter.convert(7));
        assertEquals("VIII", romanNumeralsConverter.convert(8));
        assertEquals("IX", romanNumeralsConverter.convert(9));

    }
}
