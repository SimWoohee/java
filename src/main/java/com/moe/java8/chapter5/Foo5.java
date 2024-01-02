package com.moe.java8.chapter5;

public class Foo5<E> {

    private E element;

    void set(E element){
        this.element = element;
    }

    E get(){
        return element;
    }
}
