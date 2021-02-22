package com.spaladugu.demo.strings;

public class StringReverse {

    public  String reverseString(String text){
        String s = "";
        for(int i= text.length()-1; i >= 0; i--) {
          s = s +(text.charAt(i));
        }
        return s;
    }

    public String reverseUsingStringBuffer(String text){
        StringBuffer s = new StringBuffer(text);
        return s.reverse().toString();
    }

    public String recursionReverse(String text){
        if(text.length() == 0){
            return text;
        }
        return text.charAt(text.length()-1)+recursionReverse(text.substring(0,text.length()-1));
    }
}
