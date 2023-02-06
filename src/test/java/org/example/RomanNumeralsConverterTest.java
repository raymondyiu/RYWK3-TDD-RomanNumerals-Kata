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
    public void convert2toRomanNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("II", romanNumeralsConverter.convert(2));
    }
    @Test
    public void convert3toRomanNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("III", romanNumeralsConverter.convert(3));
    }
    @Test
    public void convert4toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("IV", romanNumeralsConverter.convert(4));
    }
    @Test
    public void convert5toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("V", romanNumeralsConverter.convert(5));
    }
    @Test
    public void convert6toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("VI", romanNumeralsConverter.convert(6));
    }
    @Test
    public void convert7toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("VII", romanNumeralsConverter.convert(7));
    }
    @Test
    public void convert8toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("VIII", romanNumeralsConverter.convert(8));
    }
    @Test
    public void convert9toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("IX", romanNumeralsConverter.convert(9));
    }
    @Test
    public void convert10toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("X", romanNumeralsConverter.convert(10));
    }
    @Test
    public void convert11toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("XI", romanNumeralsConverter.convert(11));
    }
    @Test
    public void convert14toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("XIV", romanNumeralsConverter.convert(14));
    }
    @Test
    public void convert15toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("XV", romanNumeralsConverter.convert(15));
    }
    @Test
    public void convert16toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("XVI", romanNumeralsConverter.convert(16));
    }
    @Test
    public void convert19toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("XIX", romanNumeralsConverter.convert(19));
    }
    @Test
    public void convert99toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("XCIX", romanNumeralsConverter.convert(99));
    }
    @Test
    public void convert140toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("CXL", romanNumeralsConverter.convert(140));
    }
    @Test
    public void convert155toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("CLV", romanNumeralsConverter.convert(155));
    }
    @Test
    public void convert444toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("CDXLIV", romanNumeralsConverter.convert(444));
    }
    @Test
    public void convert555toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("DLV", romanNumeralsConverter.convert(555));
    }
    @Test
    public void convert666toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("DCLXVI", romanNumeralsConverter.convert(666));
    }
    @Test
    public void convert999toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("CMXCIX", romanNumeralsConverter.convert(999));
    }
    @Test
    public void convert1000toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("M", romanNumeralsConverter.convert(1000));
    }
    @Test
    public void convert1444toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("MCDXLIV", romanNumeralsConverter.convert(1444));
    }
    @Test
    public void convert1555toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("MDLV", romanNumeralsConverter.convert(1555));
    }
    @Test
    public void convert1666toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("MDCLXVI", romanNumeralsConverter.convert(1666));
    }
    @Test
    public void convert1999toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("MCMXCIX", romanNumeralsConverter.convert(1999));
    }
    @Test
    public void convert3999toNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("MMMCMXCIX", romanNumeralsConverter.convert(3999));
    }
}
