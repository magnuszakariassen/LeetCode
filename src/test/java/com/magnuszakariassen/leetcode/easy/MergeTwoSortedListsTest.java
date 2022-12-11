package com.magnuszakariassen.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    /*public static Stream<Arguments> createInputOutput() {
        return Stream.of(
                Arguments.of(new MergeTwoSortedLists.ListNode[1,2,4], new MergeTwoSortedLists.ListNode[1,3,4], )
        )
    }*/

    @ParameterizedTest
    @MethodSource("createInputOutput")
    void mergeTwoSortedLists() {

    }

}