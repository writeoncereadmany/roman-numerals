package co.unruly.romannumerals;

import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;

public class RomanNumerals {

    HashMap<Integer, String> RomanNumeralsConverter = new HashMap<Integer, String>();
            RomanNumeralsConverter.put(1,"I")
            RomanNumeralsConverter.put(5,"V")
            RomanNumeralsConverter.put(10,"X")
            RomanNumeralsConverter.put(50,"L")
            RomanNumeralsConverter.put(100,"C")

    public static String romanise(int number) {
        StringBuilder romanNumeralBuilder = new StringBuilder();

        while(number > 0) {
            if (number >= 100) {
                romanNumeralBuilder.append("C");
                number -= 100;
            }
            else if (number >= 90) {
                romanNumeralBuilder.append("XC");
                number -= 90;
            }
            else if (number >= 50) {
                romanNumeralBuilder.append("L");
                number -= 50;
            }
            else if (number >= 40) {
                romanNumeralBuilder.append("XL");
                number -= 40;
            }
            else if (number >= 10) {
                romanNumeralBuilder.append("X");
                number -= 10;
            }
            else if (number >= 9) {
                romanNumeralBuilder.append("IX");
                number -= 9;
            }
            else if (number >= 5) {
                romanNumeralBuilder.append("V");
                number -= 5;
            }
            else if (number == 4) {
                romanNumeralBuilder.append("IV");
                number -= 4;
            }
            else {
                romanNumeralBuilder.append("I");
                number -= 1;
            }
        }

        return romanNumeralBuilder.toString();
    }
}
