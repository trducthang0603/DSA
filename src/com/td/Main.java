package com.td;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> ls1 = List.of("a","b","c","d");
        List<Integer> ls2 = List.of(1,2,3);
        List<String> lstfinal = ls1.stream()
                .map(x -> ls3(String.valueOf(x), ls2))
                .collect(Collectors.toList());
        System.out.println(lstfinal);

    }
    public static String ls3(String e, List<Integer> ls2) {
        return  ls2.stream()
                .map(i -> e + i)
                .collect(Collectors.joining(","));
    }
}