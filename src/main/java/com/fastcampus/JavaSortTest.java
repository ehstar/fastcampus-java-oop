package com.fastcampus;

import com.fastcampus.logic.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSortTest <T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }
}
