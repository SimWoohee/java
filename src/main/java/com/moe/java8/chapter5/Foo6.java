package com.moe.java8.chapter5;

public class Foo6 <K,V>{

    private K first;
    private V second;


    void set(K first, V second){
        this.first = first;
        this.second = second;
    }


    K getFirst(){
        return first;
    }

    V getSecond(){
        return second;
    }
}
