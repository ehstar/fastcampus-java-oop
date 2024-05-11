package com.fastcampus;

import com.fastcampus.logic.Sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>> implements Sort<T> {
    //내용 생략 강사가 복붙함
    @Override
       public List<T> sort(List<T> list) {
            List<T> output = new ArrayList<>(list);

            for (int i = 0; i < output.size(); i++) {
                for (int j = 0; j < output.size() - 1 - i; j++) {
                    if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                        T temp = output.get(j);
                        output.set(j, output.get(j + 1));
                        output.set(j + 1, temp);
                    }
                }
            }

            return output;
        }
}