package dasz;

import java.math.BigInteger;

public class Kata {
    public static String incrementString(String str) {
        int numberOfDigits = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[chars.length - 1 - i])) numberOfDigits++;
            else break;
        }
        String result;
        if (numberOfDigits > 0 && numberOfDigits < str.length()) {
            String stringPart = str.substring(0, str.length() - numberOfDigits);
            String numberPart = str.substring(str.length() - numberOfDigits);
            String newNumberPart = String.format("%0" + numberPart.length() + "d", new BigInteger(numberPart).add(BigInteger.valueOf(1)));
            result = stringPart + newNumberPart;
        } else if (numberOfDigits == 0) result = str + 1;
        else result = String.format("%0"+str.length()+"d", new BigInteger(str).add(BigInteger.valueOf(1)));
        return result;
    }
}