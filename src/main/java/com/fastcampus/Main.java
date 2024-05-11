package com.fastcampus;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        JavaSortTest<String> javaSort = new JavaSortTest<>();
        System.out.println(javaSort.sort(List.of("3", "2", "5", "4", "1")));

        System.out.println("Hello world!");
    }
}