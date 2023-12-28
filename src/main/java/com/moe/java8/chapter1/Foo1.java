package com.moe.java8.chapter1;

public class Foo1 {

    public static void main(String[] args) {
        RunSomething runSomething = () -> System.out.println("hello");

        runSomething.doit();
        runSomething.printAge(30);
    }
}
