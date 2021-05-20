package com.spaladugu.demo.strings;

public class VowelPresent {
    public static void main(String[] args) {
        System.out.println(isVowelPresent("srivalli")); //
        System.out.println(Math.sqrt(57));
    }

    public static boolean isVowelPresent(String input) {
        return input.matches(".*[aeiou].*");
    }

}
