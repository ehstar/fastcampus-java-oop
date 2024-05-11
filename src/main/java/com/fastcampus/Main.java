package com.fastcampus;

import com.fastcampus.logic.Sort;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sort<String> sort = new JavaSortTest<>();

        System.out.println(sort.sort(List.of("3", "2", "5", "4", "1")));


    }
}