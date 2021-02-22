package com.spaladugu.demo.strings;

import java.util.Arrays;

public class AnagramFinder {

    public boolean anagramFinderUsingStringMethods(String text, String text2){
        boolean b = true;
        if (text.length() != text2.length()) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            int pos = text2.indexOf(text.charAt(i));
            if (pos == -1) {
                return false;
            }
            text2 = text2.substring(0,pos)+text2.substring(pos+1);
        }


        int i3 = 2147483647;
        char c = 65535;

        return text2.isEmpty();
    }

    public boolean anagramFinderUsingArrays(String text, String text2) {
        char[] textArray1 = text.toCharArray();
        char[] textArray2 = text2.toCharArray();
        Arrays.sort(textArray1);
        Arrays.sort(textArray2);
        return String.valueOf(textArray1).equalsIgnoreCase(String.valueOf(textArray2));
    }
}
