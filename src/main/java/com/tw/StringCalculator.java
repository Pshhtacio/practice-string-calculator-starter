package com.tw;

import java.util.Arrays;

public class StringCalculator {
    public int add(String string) {
        String[] processedString = Arrays.stream(string.split("[/;\n,;-|]"))
                .filter(s -> !s.equals(""))
                .toArray(String[]::new);

        int result = 0;
        for (String str : processedString) {
            int intValue = Integer.parseInt(str);
            result += intValue;
        }


        return result;
    }
}
