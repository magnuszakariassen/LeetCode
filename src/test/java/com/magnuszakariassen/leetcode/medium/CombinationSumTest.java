package com.magnuszakariassen.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


class CombinationSumTest {


    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void combinationSum(int[] candidates,
                        int target,
                        List<List<Integer>> expectedResult) {

        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);

        assertThat(result).isEqualTo(expectedResult);
    }

    public static Stream<Arguments> inputExpectedOutput() {
        return Stream.of(
                Arguments.of(
                        new int[]{1},
                        1,
                        List.of(
                                List.of(1))),
                Arguments.of(
                        new int[]{1, 2, 3},
                        3,
                        List.of(
                                List.of(1,1,1),
                                List.of(1,2),
                                List.of(3)))
        );
    }
}