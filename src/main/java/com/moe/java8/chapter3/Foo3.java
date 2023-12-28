package com.moe.java8.chapter3;

import java.util.function.UnaryOperator;

public class Foo3 {

    public static void main(String[] args) {


        //메소드 레퍼런스 사용하기
        //1. 스테틱 메소드 참조
        UnaryOperator<String> unaryOperator = Greeting::hello;
        System.out.println(unaryOperator.apply("moe"));

        //2. 인스턴스 메소드 참조
        Greeting greeting = new Greeting();
        UnaryOperator<String> hi = greeting::hi;
        System.out.println(hi.apply("gyommi"));


    }

}
