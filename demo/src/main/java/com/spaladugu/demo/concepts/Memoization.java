package com.spaladugu.demo.concepts;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Memoization {

    Map<Integer,Integer> memoizationTable  = new HashMap<Integer,Integer>();

    public int findFibonacciWithOutMemoization(int n) {
        System.out.println("Calculating fibonacci for n value :" + n);
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return findFibonacciWithOutMemoization(n - 1) + findFibonacciWithOutMemoization(n - 2);
    }

    public int findFibonacciWithMemoization(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (memoizationTable.containsKey(n)){
            System.out.println("Getting value from computed result for "+n);
           return memoizationTable.get(n);
        }
        System.out.println("Putting result in cache for "+n);
        int result = findFibonacciWithMemoization(n - 1) + findFibonacciWithMemoization(n - 2);
        this.memoizationTable.put(n,result);
        return result;
    }

    public static void main(String args[]) {
        Memoization m = new Memoization();
        System.out.println(m.findFibonacciWithOutMemoization(6));
        System.out.println(m.findFibonacciWithMemoization(6));
        System.out.println(findFactorial(29));
        int countFactorialTrailingZeros = m.countFactorialTrailingZeros(29);

        System.out.println("Factorial trailing zeroes for 29: "+countFactorialTrailingZeros);
    }

    private static BigInteger findFactorial(int i) {
        if(i==0){
            return new BigInteger("0");
        }
        if(i==1){
            return new BigInteger("1");
        }
        return findFactorial(i-1).multiply(new BigInteger(Integer.toString(i)));

    }

    public int countFactorialTrailingZeros(int num)
    {
        int countOfZeros=0;
        for(int i=2;i<=num;i++)
        {
            countOfZeros+=countFactorsOf5(i);
        }
        return countOfZeros;
    }

    private int countFactorsOf5(int i)
    {
        int count=0;
        while(i%5==0)
        {
            count++;
            i/=5;
        }
        return count;
    }

}
