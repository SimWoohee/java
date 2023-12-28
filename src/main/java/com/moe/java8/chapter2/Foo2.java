package com.moe.java8.chapter2;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Foo2 {

    public static void main(String[] args) {

        //Function<T, R> : T타입을 입력받아서 R타입을 리턴하는 인터페이스
        Function<Integer, Integer> plus = (number) -> number + 10;
        Function<Integer, Integer> mulies2 = (number) -> number * 2;
        System.out.println(plus.apply(20));


        //BiFunction<T, U, R> : 입력을 2개받는 function
        BiFunction<Integer, Integer, String> biFunction = (number1, number2) -> {
            if(number1 > number2){
                return number1.toString();
            }else{
                return number2.toString();
            }
        };
        System.out.println(biFunction.apply(10,5));

        //Consumer<T> : T값을 입력 받고 아무것도 리턴하지 않는 인터페이스
        Consumer<Integer> consumer = (number) -> {
            if(number > 10){
                System.out.println("success");
            }
        };
        consumer.accept(11);

        //Predicate<T> : T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
        Predicate<String> predicate = (name) -> {
            if("".equals(name)){
                return false;
            }else {
                return true;
            }
        };
        System.out.println(predicate.test(""));
    }
}
