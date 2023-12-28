package com.moe.java8.chapter1;

@FunctionalInterface
public interface RunSomething {

    void doit();

    static void printName(){
        System.out.println("Moe");
    }

    default void printAge(Integer age){
        System.out.println("Age : " + age);
    }
}
