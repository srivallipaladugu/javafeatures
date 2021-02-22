package com.spaladugu.demo.interfaces;


@FunctionalInterface
public interface Decorable {
    void decorateWithCurtains(String a);
    default void decorateWithPaints(){
        System.out.println("Decorate with paints");
    }
}
