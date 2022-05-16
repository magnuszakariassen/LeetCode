package com.magnuszakariassen.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class LongestCommonPrefixTest {

    @ParameterizedTest
    @MethodSource("getInputAndExpectedOutput")
    void longestCommonPrefix(String[] input,
                             String expectedResult) {
        String result = LongestCommonPrefix.longestCommonPrefix(input);

        Assertions.assertThat(result).isEqualTo(expectedResult);
    }

    public static Stream<Arguments> getInputAndExpectedOutput() {
        return Stream.of(
                Arguments.of(new String[]{"flow", "flower", "flight"},"fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, ""));
    }
}