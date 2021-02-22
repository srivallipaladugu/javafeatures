package com.spaladugu.demo.strings;

public class FindLargestNum {
    static int[] numbers= {3,8,10,-3,-4,5,6,987654321};

    public static int findLargestNumber (int[] array){
        int largestNum = 10;
        for(int i= 0;i< array.length; i++) {
            if(array[i]>largestNum){
                largestNum = array[i];
            }
        }
        return largestNum;
    }

    public static void main(String args[]){
      System.out.println(findLargestNumber(numbers));
       findTwoLargestNumber(numbers);
        findTwoSmallestNumber(numbers);
    }

    public static void findTwoLargestNumber(int[] array){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i= 0;i< array.length; i++) {
            int current = array[i];
            if(current < first){
                second = current;
            } else if(current > first) {
                second = first;
                first = current;
            }
        }
        System.out.println("first " + first);
        System.out.println("second " + second);
    }

    public static void findTwoSmallestNumber(int[] array){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i= 0;i< array.length; i++) {
            int current = array[i];
            if(current < first){
                second = first;
                first = array[i];
            } else if(current < second && current != first) {
                second = array[i];
            }
        }
        System.out.println("first " + first);
        System.out.println("second " + second);
    }

}
