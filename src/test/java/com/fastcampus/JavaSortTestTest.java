package com.fastcampus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTestTest {

    @DisplayName("자바소트 - 리스트 넣으면 정렬된 결과를 보여줌")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {

        // Given
        JavaSortTest<Integer> javaSort = new JavaSortTest<>();

        // When
        List<Integer> result = javaSort.sort(List.of(3,2,5,4,1));

        // Then
        assertEquals(List.of(1,2,3,4,5), result);
    }
}