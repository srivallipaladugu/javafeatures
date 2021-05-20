package com.spaladugu.demo;

public class FindTwoLargestNumbers {
    public static void main(String[] args) {
        System.out.println(findSecondHighest(new int[]{0,-20,-30,-40,-100000}));
        System.out.println(findSecondHighest(new int[]{20,30,40,100000}));
    }

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
}
