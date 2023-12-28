package com.moe.java8.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Foo4 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("spring");
        list.add("banana");
        list.add("orange");

        //스트림 api사용
        List<String> lists = list.stream().map(s -> {
            if("apple".equals(s)){
                return "many apple";
            }
            return s.toUpperCase();
        }).collect(Collectors.toList());

        System.out.println(lists);

        List<String> spring = list.stream().filter(s -> s.startsWith("spring")).collect(Collectors.toList());
        System.out.println(spring);


    }
}
