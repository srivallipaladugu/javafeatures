package com.spaladugu.demo.java8;

import com.spaladugu.demo.interfaces.Decorable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceTest {

    static List<String> countryList = Arrays.asList(new String[]{"India","America","Asia","Japan","Vietnam"});
    public static void main(String args[]){
        Decorable decorable = (s) ->  System.out.println("Decorate with curtains " + s);
        decorable.decorateWithPaints();
        decorable.decorateWithCurtains("added");
        countryList.sort((s1,s2)-> s1.compareTo(s2));
        countryList.stream().forEach(s -> {s = s.toUpperCase(); System.out.println(s);});
        countryList.stream().map(s->s.toUpperCase()).forEach(System.out::println);
        //List<Integer> finalList = PowerFunctions.calculatePowerOf2(Arrays.asList(new Integer[]{1,2,3,4,5}), num -> PowerFunctions.power(num));
        List<Integer> finalList = PowerFunctions.calculatePowerOf2(Arrays.asList(new Integer[]{1,2,3,4,5}), PowerFunctions::power);
        System.out.println(finalList);
    }
}
