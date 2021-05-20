package com.spaladugu.demo;

public class NumberSwap {
    static int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        System.out.println(" a = " + a + ", b = " + b);
        swap();
        System.out.println(" a = " + a + ", b = " + b);
    }

    public static void swap() {
        b = a + b; // b= 30 , a =10
        a = b - a; // a= 20 , b= 30
        b = b - a; // b= 10 , a = 20
    }

}
