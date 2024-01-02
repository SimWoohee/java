package com.moe.java8.chapter5;

import java.util.HashMap;

public class main {

    public static void main(String[] args) {
        Foo5<String> main1 = new Foo5<>();
        main1.set("sim");
        Foo5<Integer> main2 = new Foo5<>();
        main2.set(10);

        System.out.println(main1.get());
        System.out.println(main2.get());


        Foo6<String, Integer> main3 = new Foo6<>();
        main3.set("SimWooHee", 30);

        System.out.println(main3.getFirst());


    }



}
