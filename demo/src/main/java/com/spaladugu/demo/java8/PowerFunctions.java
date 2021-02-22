package com.spaladugu.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PowerFunctions {
    public static Integer power(int a){
        return a*a;
    }

    public static List<Integer> calculatePowerOf2(List<Integer> list, Function<Integer,Integer> func){
        List<Integer> finalList = new ArrayList<>();
        list.forEach( f -> {
            Integer result = func.apply(f);
            finalList.add(result);
        });
        return  finalList;
    }

}
